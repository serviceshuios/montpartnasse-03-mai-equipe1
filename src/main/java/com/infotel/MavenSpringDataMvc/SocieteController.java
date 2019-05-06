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

    @RequestMapping(value = "/indexSociete", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("societetransport", new SocieteController());
        model.addAttribute("societestransports", service.findAllSocieteTransport());
        return "societestransports";
    }

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
        @RequestMapping(value = "/deleteSociete")
        public String delete(@RequestParam int idSociete, Model model) {
            service.supprimerSocieteTransport(idSociete);
            model.addAttribute("societetransport", new SocieteTransport());
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        }

        @RequestMapping(value = "/editSociete")//prendre la personne pour la modifier
        public String edit(@RequestParam int idSociete, Model model) {
            model.addAttribute("societetransport", service.getSocieteTransport(idSociete));
            model.addAttribute("societestransports", service.findAllSocieteTransport());
            return "societestransports";
        }
    


}
