package com.infotel.MavenSpringDataMvc.service;


import com.infotel.MavenSpringDataMvc.metier.Cargaison;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

public interface Iservice {

	//++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les cargaisons +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Cargaison ajouterCargaison(Cargaison c);
	public Cargaison getCargaison(int idCargaison);
	public void supprimerCargaison(int idCargaison);
	public Cargaison modifierCargaison(Cargaison c);
	public Iterable<Cargaison> findAllCargaison();
	//public void modifierCargaisonV2(String nomCargaison, String depart, String destination, Integer idCargaison);
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les societes de transport +++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s);
	public SocieteTransport getSocieteTransport(int idSociete);
	public void supprimerSocieteTransport(int idSociete);

	public SocieteTransport modifierSocieteTransport(SocieteTransport s);
	public Iterable<SocieteTransport> findAllSocieteTransport();
	//public void modifierSocieteTransportV2(String nomSociete, String numSiret, Date dateCreation,Integer idSociete);
}
