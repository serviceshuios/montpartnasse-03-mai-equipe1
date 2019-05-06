package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class SocieteController {
	@Autowired
    private Iservice service;

	/**
	 * Cette methode permet d'aller sur la jsp concernant les societes de transport avec des champs libres
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/indexSociete", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("societetransport", new SocieteTransport());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "societestransports";
    }

    /**
	 * Cette methode permet, en cliquant sur "enregistrer", soit d'ajouter, soit de modifier la societe de transport en question
	 * @param societetransport
	 * @param model
	 * @return
	 */
    @RequestMapping(value = "/saveSociete")
    public String save(SocieteTransport societetransport,  Model model) {
        if (societetransport.getIdSociete() == 0) {
            service.ajouterSocieteTransport(societetransport);
            model.addAttribute("societetransport", new SocieteTransport());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        } else {
            service.modifierSocieteTransport(societetransport);
            model.addAttribute("societetransport", new SocieteTransport());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        }
    }
    
    /**
	 * Cette methode permet de supprimer une societe de transport de la base de données en utilisant le lien "supprimer"
	 * @param idSociete
	 * @param model
	 * @return
	 */
        @RequestMapping(value = "/deleteSociete")//je dois trouver ce bouton dans jsp
        public String delete(@RequestParam int idSociete, Model model) {
            service.supprimerSocieteTransport(idSociete);
            model.addAttribute("societetransport", new SocieteTransport());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        }

        /**
    	 * Cette methode permet de mettre les attributs d'une cargaison existante en BDD dans les champs afin de les modifier 
    	 * @param idSociete
    	 * @param model
    	 * @return
    	 */
        @RequestMapping(value = "/editSociete")//prendre la personne pour la modifier
        public String edit(@RequestParam int idSociete, Model model) {
            model.addAttribute("societetransport", service.getSocieteTransport(idSociete));
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        }
    


}
