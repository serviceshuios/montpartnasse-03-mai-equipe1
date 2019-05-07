package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class RoutiereController {
	
	@Autowired
	Iservice service;
	
	/**
	 * Cette methode permet d'aller sur la jsp concernant les cargaisons routieres avec des champs libres
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/indexRoutiere", method = RequestMethod.GET)
	public String pageRoutiere(Model model) {
		model.addAttribute("routiere", new Routiere()); 	//crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire
		model.addAttribute("routieres", service.findAllRoutiere());	
		model.addAttribute("societestransports", service.findAllSocieteTransport());//remlpi la liste des cargaisons aeriennes en jsp
		return "routiere";									//designe la jsp
	}
	
	/**
	 * Cette methode permet, en cliquant sur "enregistrer", soit d'ajouter, soit de modifier la cargaison en question
	 * @param routiere
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/saveRoutiere")
	public String saveRout(Routiere routiere, Model model) {
		if (routiere.getIdCargaison() == 0) {
            service.ajouterRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutiere());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "routiere";
        } else {
            service.modifierRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutiere());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "routiere";
        }
	}
	
	/**
	 * Cette methode permet de supprimer une cargaison de la base de données en utilisant le lien "supprimer"
	 * @param idRoutiere
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/deleteRoutiere")
    public String deleteRout(@RequestParam int idRoutiere, Model model) {
        service.supprimerRoutiere(idRoutiere);
        model.addAttribute("routiere", new Routiere());
        model.addAttribute("routieres", service.findAllRoutiere());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "routiere";
    }
	
	/**
	 * Cette methode permet de mettre les attributs d'une cargaison existante en BDD dans les champs afin de les modifier 
	 * @param idRoutiere
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/editRoutiere")
    public String editRout(@RequestParam int idRoutiere, Model model) {
        model.addAttribute("routiere", service.getRoutiere(idRoutiere));
        model.addAttribute("routieres", service.findAllRoutiere());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "routiere";
    }
    
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Attribution d'une cargaison à une societe ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    /**
     *  Cette methode permet d'aller sur la jsp concernant l'attribution des cargaisons routieres à des societes
     * @param model
     * @return
     */
    @RequestMapping(value = "/indexAttribRout", method = RequestMethod.GET)
	public String pageAttribRout(Model model) {
		model.addAttribute("routiere", new Routiere()); 	//crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire
		model.addAttribute("routieres", service.findAllRoutiere());		//remlpi la liste des cargaisons aeriennes en jsp
		model.addAttribute("societestransports", service.findAllSocieteTransport());		//remlpi la liste des cargaisons aeriennes en jsp
		return "attribuerRoutiereSociete";									//designe la jsp
	}
    
    /**
     * Cette methode permet de lier une cargaison routiere à une societe de trnasport
     * @param idSociete
     * @param idCargaison
     * @param model
     * @return
     */
    @RequestMapping(value = "/attribRoutiereSociete")
	public String attribRout(@RequestParam int idSociete,@RequestParam int idCargaison, Model model) {
		//if (aerienne.getIdCargaison() == 0) {
            service.attribuerRoutiereSociete(idSociete, idCargaison);
            model.addAttribute("routieres", service.findAllRoutiere());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "attribuerRoutiereSociete";
        //}
    }
}
