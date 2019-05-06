/**
 * Cette classe permet de gerer la creation, modification et suppression de cargaisons aeriennes en base de données
 */

package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class AerienneController {
	
	@Autowired
	Iservice service;
	
	/**
	 * Cette methode permet d'aller sur la jsp concernant les cargaisons aeriennes avec des champs libres
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/indexAerienne", method = RequestMethod.GET)
	public String pageAerienne(Model model) {
		model.addAttribute("aerienne", new Aerienne()); 	//crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire
		model.addAttribute("aeriennes", service.findAllAerienne());		//remlpi la liste des cargaisons aeriennes en jsp
		model.addAttribute("societestransports", service.findAllSocieteTransport());		//remlpi la liste des cargaisons aeriennes en jsp
		return "aerienne";									//designe la jsp
	}
	
	/**
	 * Cette methode permet, en cliquant sur "enregistrer", soit d'ajouter, soit de modifier la cargaison en question
	 * @param aerienne
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/saveAerienne")
	public String saveAer(Aerienne aerienne, Model model) {
		if (aerienne.getIdCargaison() == 0) {
            service.ajouterAerienne(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllAerienne());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "aerienne";
        } else {
            service.modifierAerienne(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllAerienne());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "aerienne";
        }
	}
	
	/**
	 * Cette methode permet de supprimer une cargaison de la base de données en utilisant le lien "supprimer"
	 * @param idAerienne
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/deleteAerienne")
    public String deleteAer(@RequestParam int idAerienne, Model model) {
        service.supprimerAerienne(idAerienne);
        model.addAttribute("aerienne", new Aerienne());
        model.addAttribute("aeriennes", service.findAllAerienne());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "aerienne";
    }
	
	/**
	 * Cette methode permet de mettre les attributs d'une cargaison existante en BDD dans les champs afin de les modifier 
	 * @param idAerienne
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/editAerienne")
    public String editAer(@RequestParam int idAerienne, Model model) {
        model.addAttribute("aerienne", service.getAerienne(idAerienne));
        model.addAttribute("aeriennes", service.findAllAerienne());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "aerienne";
    }
}
