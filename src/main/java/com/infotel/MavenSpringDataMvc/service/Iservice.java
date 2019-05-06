package com.infotel.MavenSpringDataMvc.service;


import java.util.List;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

public interface Iservice {

	//++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les aeriennes +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Aerienne ajouterAerienne(Aerienne c);
	public Aerienne getAerienne(int idAerienne);
	public void supprimerAerienne(int idAerienne);
	public Aerienne modifierAerienne(Aerienne c);
	public List<Aerienne> findAllAerienne();
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les routieres +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Routiere ajouterRoutiere(Routiere c);
	public Routiere getRoutiere(int idRoutiere);
	public void supprimerRoutiere(int idRoutiere);
	public Routiere modifierRoutiere(Routiere c);
	public List<Routiere> findAllRoutiere();
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les societes de transport +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s);
	public SocieteTransport getSocieteTransport(int idSociete);
	public void supprimerSocieteTransport(int idSociete);
	public SocieteTransport modifierSocieteTransport(SocieteTransport s);
	public Iterable<SocieteTransport> findAllSocieteTransport();
	
	void attribuerAerienneSociete(int idSociete, int idCargaison);
	void attribuerRoutiereSociete(int idSociete, int idCargaison);
	
}
