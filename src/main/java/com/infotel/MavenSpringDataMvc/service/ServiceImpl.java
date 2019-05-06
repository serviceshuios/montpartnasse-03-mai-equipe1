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
	@Override
	public Aerienne ajouterAerienne(Aerienne c) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(c);
	}
	@Override
	public Aerienne getAerienne(int idAerienne) {
		// TODO Auto-generated method stub
		return aerienneRepository.findById(idAerienne).get();
	}
	@Override
	public void supprimerAerienne(int idAerienne) {
		// TODO Auto-generated method stub
		aerienneRepository.deleteById(idAerienne);
	}
	@Override
	public Aerienne modifierAerienne(Aerienne c) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(c);
	}
	@Override
	public List<Aerienne> findAllAerienne() {
		// TODO Auto-generated method stub
		return aerienneRepository.findAll();
	}
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour routieres ++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public Routiere ajouterRoutiere(Routiere c) {
		// TODO Auto-generated method stub
		return routiereRepository.save(c);
	}
	@Override
	public Routiere getRoutiere(int idRoutiere) {
		// TODO Auto-generated method stub
		return routiereRepository.findById(idRoutiere).get();
	}
	@Override
	public void supprimerRoutiere(int idRoutiere) {
		// TODO Auto-generated method stub
		routiereRepository.deleteById(idRoutiere);
	}
	@Override
	public Routiere modifierRoutiere(Routiere c) {
		// TODO Auto-generated method stub
		return routiereRepository.save(c);
	}
	@Override
	public List<Routiere> findAllRoutiere() {
		// TODO Auto-generated method stub
		return routiereRepository.findAll();
	}
	
	
	
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
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ Methodes pour attribuer une cargaison à une societe +++++++++++++++++++++++++++++++++
	@Override
	public void attribuerAerienneSociete(int idSociete, int idCargaison) {
		// TODO Auto-generated method stub
		aerienneRepository.attribuerAerienneSociete(idSociete, idCargaison);
	}
	@Override
	public void attribuerRoutiereSociete(int idSociete, int idCargaison) {
		// TODO Auto-generated method stub
		routiereRepository.attribuerRoutiereSociete(idSociete, idCargaison);
	}	
}
