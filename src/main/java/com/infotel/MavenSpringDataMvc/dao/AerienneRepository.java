/**
 * Cette classe est la classe repository des cargaisons aeriennes
 */
package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;


public interface AerienneRepository extends JpaRepository<Aerienne, Integer>{

	/**
	 * Cette methode doit permettre de lier une societe à une cargaison
	 * @param idSociete
	 * @param idCargaison
	 */
	@Transactional
	@Modifying
	@Query("UPDATE Cargaison p set p.societetransport.idSociete = ?1 WHERE p.idCargaison = ?2")
	public void attribuerAerienneSociete(int idSociete, int idCargaison);
}
