/**
 * Cette classe est la classe repository des societes de trnasport
 */
package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

public interface SocieteTransportRepository extends JpaRepository<SocieteTransport, Integer>{

	
}
