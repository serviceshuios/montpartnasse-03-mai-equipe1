package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

public interface SocieteTransportRepository extends JpaRepository<SocieteTransport, Integer>{

	/*@Transactional
	@Modifying
	@Query("UPDATE SocieteTransport p set p.nomSociete = ?1, p.Siret = ?2, p.dateCreation = ?3 WHERE p.idSociete = ?4")
	public void modifierCargaisonV2(String nomSociete, String numSiret, Date dateCreation,Integer idSociete);*/
}
