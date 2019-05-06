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
		model.addAttribute("routieres", service.findAllRoutiere());		//remlpi la liste des cargaisons aeriennes en jsp
		return "routiere";									//designe la jsp
	}
	
	@RequestMapping(value = "/saveRoutiere")
	public String saveRout(Routiere routiere, Model model) {
		if (routiere.getIdCargaison() == 0) {
            service.ajouterRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutiere());
            return "routiere";
        } else {
            service.modifierRoutiere(routiere);
            model.addAttribute("routiere", new Routiere());
            model.addAttribute("routieres", service.findAllRoutiere());
            return "routiere";
        }
	}
	
	@RequestMapping(value = "/deleteRoutiere")
    public String deleteRout(@RequestParam int idRoutiere, Model model) {
        service.supprimerRoutiere(idRoutiere);
        model.addAttribute("routiere", new Routiere());
        model.addAttribute("routieres", service.findAllRoutiere());
        return "routiere";
    }
    @RequestMapping(value = "/editRoutiere")
    public String editRout(@RequestParam int idRoutiere, Model model) {
        model.addAttribute("routiere", service.getRoutiere(idRoutiere));
        model.addAttribute("routieres", service.findAllRoutiere());
        return "routiere";
    }
}
