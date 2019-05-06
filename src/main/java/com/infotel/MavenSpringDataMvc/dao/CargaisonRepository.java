package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infotel.MavenSpringDataMvc.metier.Cargaison;

public interface CargaisonRepository extends JpaRepository<Cargaison, Integer>{

	/*@Transactional
	@Modifying
	@Query("UPDATE Cargaison p set p.nomCargaison = ?1, p.depart = ?2, p.destination = ?3 WHERE p.idCargaison = ?4")
	public void modifierCargaisonV2(String nomCargaison, String depart, String destination,Integer idCargaison);*/
	
}
