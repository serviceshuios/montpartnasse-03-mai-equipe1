package com.infotel.MavenSpringDataMvc.metier;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@DiscriminatorValue("ROUT")
@Component
@Scope(value="prototype")
/**
 * 
 * @author IN-MP-023
 *
 */
public class Routiere extends Cargaison {
	private String immatriculation;
	private double peage;
	/**
	 * cette methode permet de retourner l'immatriculation
	 * @return renvoie l'immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}
	/**
	 * cette methode permet de setter l'immatriculation
	 * @param immatriculation l'immatriculation
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	/**
	 * cette methode permet de retourner le peage
	 * @return renvoie le peage
	 */
	public double getPeage() {
		return peage;
	}
	/**
	 * cette methode permet de setter le peage
	 * @param peage le peage
	 */
	public void setPeage(double peage) {
		this.peage = peage;
	}
	@Override
	public String toString() {
		return "Routiere [immatriculation=" + immatriculation + ", peage=" + peage + ", toString()=" + super.toString()
				+ "]";
	}
	

}
