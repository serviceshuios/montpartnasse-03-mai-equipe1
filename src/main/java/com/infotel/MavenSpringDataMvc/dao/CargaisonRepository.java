package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CargaisonRepository {

	@Transactional
	@Modifying
	@Query("UPDATE Cargaison p set p.nomCargaison = ?1, p.depart = ?2, p.destination = ?3 WHERE p.idCargaison = ?4")
	public void modifierCargaisonV2(String nomCargaison, String depart, String destination,Integer idCargaison);
}
