package com.infotel.MavenSpringDataMvc.metier;

import javax.persistence.DiscriminatorColumn;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * 
 * @author IN-MP-023
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CARG")
//@DiscriminatorValue("CARG")
@Component
@Scope(value="prototype")
public abstract class Cargaison {
	
	public SocieteTransport getSocietetransport() {
		return societetransport;
	}
	public void setSocietetransport(SocieteTransport societetransport) {
		this.societetransport = societetransport;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int idCargaison;
	protected String nomCargaison;
	protected String depart;
	protected String destination;
	@ManyToOne 
	private SocieteTransport societetransport;
	/**
	 * cette methode permet de retourner l'id de cargaison
	 * @return renoie l'id de cargaison
	 */
	public int getIdCargaison() {
		return idCargaison;
	}
	/**
	 * cette methode permet de setter l'id de cargaison
	 * @param idCargaison
	 */
	public void setIdCargaison(int idCargaison) {
		this.idCargaison = idCargaison;
	}
	/**
	 * cette methode permet de retourner le nomdecargaison
	 * @return renvoie le nomCargaison
	 */
	public String getNomCargaison() {
		return nomCargaison;
	}
	/**
	 * cette methode permet de setter le nom de cargaison
	 * @param nomCargaison le nom de cargaison 
	 */
	public void setNomCargaison(String nomCargaison) {
		this.nomCargaison = nomCargaison;
	}
	/**
	 * cette methode permet de retourner le depart
	 * @return renvoie le depart
	 */
	public String getDepart() {
		return depart;
	}
	/**
	 * cette methode permet de setter le depart
	 * @param depart le depart
	 */
	public void setDepart(String depart) {
		this.depart = depart;
	}
	/**
	 * cette methode permet de retourner la destination
	 * @return renvoie la destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * cette methode permet de setter la destination
	 * @param destination la destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Cargaison [idCargaison=" + idCargaison + ", nomCargaison=" + nomCargaison + ", depart=" + depart
				+ ", destination=" + destination + "]";
	}
	
	

}
