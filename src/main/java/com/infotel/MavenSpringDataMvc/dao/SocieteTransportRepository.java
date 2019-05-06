package com.infotel.MavenSpringDataMvc.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface SocieteTransportRepository {

	@Transactional
	@Modifying
	@Query("UPDATE SocieteTransport p set p.nomSociete = ?1, p.Siret = ?2, p.dateCreation = ?3 WHERE p.idSociete = ?4")
	public void modifierCargaisonV2(String nomSociete, String Siret, Date dateCreation,Integer idSociete);
}
