package com.infotel.MavenSpringDataMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.CargaisonRepository;
import com.infotel.MavenSpringDataMvc.dao.SocieteTransportRepository;
import com.infotel.MavenSpringDataMvc.metier.Cargaison;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

@Service
public class ServiceImpl implements Iservice{

	@Autowired
	private CargaisonRepository cargaisonRepository;
	
	public CargaisonRepository getCargaisonRepository() {
		return cargaisonRepository;
	}
	public void setCargaisonRepository(CargaisonRepository cargaisonRepository) {
		this.cargaisonRepository = cargaisonRepository;
	}

	@Autowired
	private SocieteTransportRepository societetransportRepository;

	public SocieteTransportRepository getSocietetransportRepository() {
		return societetransportRepository;
	}
	public void setSocietetransportRepository(SocieteTransportRepository societetransportRepository) {
		this.societetransportRepository = societetransportRepository;
	}
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour cargaisons ++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public Cargaison ajouterCargaison(Cargaison c) {
		// TODO Auto-generated method stub
		return cargaisonRepository.save(c);
	}
	@Override
	public Cargaison getCargaison(int idCargaison) {
		// TODO Auto-generated method stub
		return cargaisonRepository.findById(idCargaison).get();
	}
	@Override
	public void supprimerCargaison(int idCargaison) {
		// TODO Auto-generated method stub
		cargaisonRepository.deleteById(idCargaison);
	}
	@Override
	public Cargaison modifierCargaison(Cargaison c) {
		// TODO Auto-generated method stub
		return cargaisonRepository.save(c);
	}
	@Override
	public Iterable<Cargaison> findAllCargaison() {
		// TODO Auto-generated method stub
		return cargaisonRepository.findAll();
	}
	/*@Override
	public void modifierCargaisonV2(String nomCargaison, String depart, String destination, Integer idCargaison) {
		// TODO Auto-generated method stub
		cargaisonRepository.modifierCargaisonV2(nomCargaison, depart, destination, idCargaison);
	}*/
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour les societes de transport ++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societetransportRepository.save(s);
	}
	@Override
	public SocieteTransport getSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		return societetransportRepository.findById(idSociete).get();
	}
	@Override
	public void supprimerSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		societetransportRepository.deleteById(idSociete);
	}
	@Override
	public SocieteTransport modifierSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societetransportRepository.save(s);
	}
	@Override
	public Iterable<SocieteTransport> findAllSocieteTransport() {
		// TODO Auto-generated method stub
		return societetransportRepository.findAll();
	}
	/*@Override
	public void modifierSocieteTransportV2(String nomSociete, String numSiret, Date dateCreation, Integer idSociete) {
		// TODO Auto-generated method stub
		societetransportRepository.modifierSocieteTransportV2(nomSociete, numSiret, dateCreation, idSociete);
	}*/	
}
