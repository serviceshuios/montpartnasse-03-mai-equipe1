package com.infotel.MavenSpringDataMvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.service.Iservice;

@Controller
public class RoutiereController {
	
	@Autowired
	Iservice service;
	
	@RequestMapping(value = "/indexRoutiere", method = RequestMethod.GET)
	public String pageRoutiere(Model model) {
		model.addAttribute("routiere", new Routiere()); 	//crée un pauchoir avec les attributs de la classe Aerienne sur le formulaire
		model.addAttribute("routieres", service.findAllCargaison());		//remlpi la liste des cargaisons aeriennes en jsp
		return "routiere";									//designe la jsp
	}
	
	@RequestMapping(value = "/saveRoutiere")
	public String saveRout(Routiere routiere, Model model) {
		if (routiere.getIdCargaison() == 0) {
            service.ajouterCargaison(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllCargaison());
            return "routiere";
        } else {
            service.modifierCargaison(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllCargaison());
            return "routiere";
        }
	}
	
	@RequestMapping(value = "/deleteRoutiere")
    public String deleteRout(@RequestParam int idRoutiere, Model model) {
        service.supprimerCargaison(idRoutiere);
        model.addAttribute("routiere", new Routiere());
        model.addAttribute("routieres", service.findAllCargaison());
        return "routiere";
    }
    @RequestMapping(value = "/editRoutiere")
    public String editRout(@RequestParam int idRoutiere, Model model) {
        model.addAttribute("routiere", service.getCargaison(idRoutiere));
        model.addAttribute("routieres", service.findAllCargaison());
        return "routiere";
    }
}
