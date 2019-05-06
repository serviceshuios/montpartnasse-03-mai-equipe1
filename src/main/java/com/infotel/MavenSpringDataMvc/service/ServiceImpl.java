/**
 * Cette classe montre l'implementation des methodes
 */
package com.infotel.MavenSpringDataMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.AerienneRepository;
import com.infotel.MavenSpringDataMvc.dao.RoutiereRepository;
import com.infotel.MavenSpringDataMvc.dao.SocieteTransportRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

@Service
public class ServiceImpl implements Iservice{

	@Autowired
	private AerienneRepository aerienneRepository;
	
	public AerienneRepository getAerienneRepository() {
		return aerienneRepository;
	}
	public void setAerienneRepository(AerienneRepository aerienneRepository) {
		this.aerienneRepository = aerienneRepository;
	}
	
	@Autowired
	private RoutiereRepository routiereRepository;

	public RoutiereRepository getRoutiereRepository() {
		return routiereRepository;
	}
	public void setRoutiereRepository(RoutiereRepository routiereRepository) {
		this.routiereRepository = routiereRepository;
	}

	@Autowired
	private SocieteTransportRepository societetransportRepository;

	public SocieteTransportRepository getSocietetransportRepository() {
		return societetransportRepository;
	}
	public void setSocietetransportRepository(SocieteTransportRepository societetransportRepository) {
		this.societetransportRepository = societetransportRepository;
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour aeriennes ++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * Cette methode permet d'ajouter une cargaison aerienne en BDD
	 */
	@Override
	public Aerienne ajouterAerienne(Aerienne c) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(c);
	}
	
	/**
	 * Cette methode permet de trouver une cargaison aerienne en BDD
	 */
	@Override
	public Aerienne getAerienne(int idAerienne) {
		// TODO Auto-generated method stub
		return aerienneRepository.findById(idAerienne).get();
	}
	
	/**
	 * Cette methode permet de supprimer une cargaison aerienne en BDD
	 */
	@Override
	public void supprimerAerienne(int idAerienne) {
		// TODO Auto-generated method stub
		aerienneRepository.deleteById(idAerienne);
	}
	
	/**
	 * Cette methode permet de modifier une cargaison aerienne en BDD
	 */
	@Override
	public Aerienne modifierAerienne(Aerienne c) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(c);
	}
	
	/**
	 * Cette methode permet de trouver toutes les cargaisons aeriennes en BDD
	 */
	@Override
	public List<Aerienne> findAllAerienne() {
		// TODO Auto-generated method stub
		return aerienneRepository.findAll();
	}
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour routieres ++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * Cette methode permet d'ajouter une cargaison routiere en BDD
	 */
	@Override
	public Routiere ajouterRoutiere(Routiere c) {
		// TODO Auto-generated method stub
		return routiereRepository.save(c);
	}
	
	/**
	 * Cette methode permet de trouver une cargaison routiere en BDD
	 */
	@Override
	public Routiere getRoutiere(int idRoutiere) {
		// TODO Auto-generated method stub
		return routiereRepository.findById(idRoutiere).get();
	}
	
	/**
	 * Cette methode permet de supprimer une cargaison routiere en BDD
	 */
	@Override
	public void supprimerRoutiere(int idRoutiere) {
		// TODO Auto-generated method stub
		routiereRepository.deleteById(idRoutiere);
	}
	
	/**
	 * Cette methode permet de modifier une cargaison routiere en BDD
	 */
	@Override
	public Routiere modifierRoutiere(Routiere c) {
		// TODO Auto-generated method stub
		return routiereRepository.save(c);
	}
	
	/**
	 * Cette methode permet de trouver toutes les cargaisons routieres en BDD
	 */
	@Override
	public List<Routiere> findAllRoutiere() {
		// TODO Auto-generated method stub
		return routiereRepository.findAll();
	}
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les societes de transport ++++++++++++++++++++++++++++++++++++++++++++++
	
	/**
	 * Cette methode permet d'ajouter une societe de transport en BDD
	 */
	@Override
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societetransportRepository.save(s);
	}
	
	/**
	 * Cette methode permet de trouver une societe de transport en BDD
	 */
	@Override
	public SocieteTransport getSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		return societetransportRepository.findById(idSociete).get();
	}
	
	/**
	 * Cette methode permet de supprimer une societe de transport en BDD
	 */
	@Override
	public void supprimerSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		societetransportRepository.deleteById(idSociete);
	}
	
	/**
	 * Cette methode permet de modifier une societe de transport en BDD
	 */
	@Override
	public SocieteTransport modifierSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societetransportRepository.save(s);
	}
	
	/**
	 * Cette methode permet de trouver toutes les societes de transport en BDD
	 */
	@Override
	public Iterable<SocieteTransport> findAllSocieteTransport() {
		// TODO Auto-generated method stub
		return societetransportRepository.findAll();
	}
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour attribuer une cargaison à une societe +++++++++++++++++++++++++++++++++
	
	/**
	 * Cette methode permet de lier des societes de transport à des cargaisons aeriennes en BDD
	 */
	@Override
	public void attribuerAerienneSociete(int idSociete, int idCargaison) {
		// TODO Auto-generated method stub
		aerienneRepository.attribuerAerienneSociete(idSociete, idCargaison);
	}
	
	/**
	 * Cette methode permet de lier des societes de transport à des cargaisons routieres en BDD
	 */
	@Override
	public void attribuerRoutiereSociete(int idSociete, int idCargaison) {
		// TODO Auto-generated method stub
		routiereRepository.attribuerRoutiereSociete(idSociete, idCargaison);
	}	
}
