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
	
	@RequestMapping(value = "/indexAerienne", method = RequestMethod.GET)
	public String pageAerienne(Model model) {
		model.addAttribute("aerienne", new Aerienne()); 	//crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire
		model.addAttribute("aeriennes", service.findAllCargaison());		//remlpi la liste des cargaisons aeriennes en jsp
		return "aerienne";									//designe la jsp
	}
	
	@RequestMapping(value = "/saveAerienne")
	public String saveAer(Aerienne aerienne, Model model) {
		if (aerienne.getIdCargaison() == 0) {
            service.ajouterCargaison(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllCargaison());
            return "aerienne";
        } else {
            service.modifierCargaison(aerienne);
            model.addAttribute("aerienne", new Aerienne());
            model.addAttribute("aeriennes", service.findAllCargaison());
            return "aerienne";
        }
	}
	
	@RequestMapping(value = "/deleteAerienne")
    public String deleteAer(@RequestParam int id, Model model) {
        service.supprimerCargaison(id);
        model.addAttribute("aerienne", new Aerienne());
        model.addAttribute("aeriennes", service.findAllCargaison());
        return "aerienne";
    }
    @RequestMapping(value = "/editAerienne")
    public String editAer(@RequestParam int id, Model model) {
        model.addAttribute("aerienne", service.getCargaison(id));
        model.addAttribute("aeriennes", service.findAllCargaison());
        return "aerienne";
    }
}
