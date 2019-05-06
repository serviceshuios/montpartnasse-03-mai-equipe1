/**
 * Cette classe est la classe repository des cargaisons routieres
 */
package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Routiere;

public interface RoutiereRepository extends JpaRepository<Routiere, Integer>{

	/**
	 * Cette methode doit permettre de lier une societe à une cargaison
	 * @param idSociete
	 * @param idCargaison
	 */
	@Transactional
	@Modifying
	@Query("UPDATE Cargaison p set p.societetransport.idSociete = ?1 WHERE p.idCargaison = ?2")
	public void attribuerRoutiereSociete(int idSociete, int idCargaison);
}
