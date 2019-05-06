/**
 * ce package consiste à presenter la classe Aerienne 
 */
package com.infotel.MavenSpringDataMvc.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 * 
 * @author IN-MP-023
 *
 */
@Entity
@DiscriminatorValue("AER")
@Component
@Scope(value="prototype")
public class Aerienne extends Cargaison{
	private String numVol;
	private double taxe;
	/**
	 *  cette methode permet de retourner le numero du vol
     *     @return renvoie le num de vol
	
	 */
	public String getNumVol() {
		return numVol;
	}
	/**
	 * cette methode permet de setter le num de vol
	 * @param numVol le numero du vol
	 */
	public void setNumVol(String numVol) {
		this.numVol = numVol;
	}
	/**
	 * cette methode permet de retourner le taxe
	 * @return renvoie le taxe
	 */
	public double getTaxe() {
		return taxe;
	}
	/**
	 * cette methode permet de setter le txe
	 * @param taxe le taxe 
	 */
	public void setTaxe(double taxe) {
		this.taxe = taxe;
	}
	@Override
	public String toString() {
		return "Aerienne [numVol=" + numVol + ", taxe=" + taxe + ", toString()=" + super.toString() + "]";
	}
	

}
