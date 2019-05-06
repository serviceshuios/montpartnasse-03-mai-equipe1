package com.infotel.MavenSpringDataMvc.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Component
@Scope(value="prototype")
/**
 * 
 * @author IN-MP-023
 *
 */
public class SocieteTransport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int idSociete;
private String nomSociete;
private String numSiret;
private Date dateCreation;
@OneToMany(mappedBy="societetransport")
private List<Cargaison>cargaisons;//=new ArrayList<Cargaison>();
/**
 * cette methode permet de retourner la liste de cargaison
 * @return renvoie les cargaisons
 */
public List<Cargaison> getCargaisons() {
	return cargaisons;
}
/**
 * cette methode permet de setter les cargaisons
 * @param cargaisons les cargaisons
 */
public void setCargaisons(List<Cargaison> cargaisons) {
	this.cargaisons = cargaisons;
}
@Override
public String toString() {
	return "SocieteTransport [idSociete=" + idSociete + ", nomSociete=" + nomSociete + ", numSiret=" + numSiret
			+ ", dateCreation=" + dateCreation + "]";
}
/**
 * cette methode permet de retourner l'id de la societe
 * @return l'id de la societe
 */
public int getIdSociete() {
	return idSociete;
}
/**
 * cette methode permet de setter l'id de la societe
 * @param idSociete l'id de la societe
 */
public void setIdSociete(int idSociete) {
	this.idSociete = idSociete;
}
/**
cette methode permet de retourner le nom de la societe
 * @return renvoie le nom de la societe
 */
public String getNomSociete() {
	return nomSociete;
}
/**
 * cette methode permet de setter le nom de la societe
 * @param nomSociete le nom de la societe
 */
public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}
/**
 * cette methode permet de retourner le numero de la siret
 * @return renvoie le num de la siret
 */
public String getNumSiret() {
	return numSiret;
}
/**
 * cette methode permet de setter le num de la siret
 * @param numSiret le numero de la siret
 */
public void setNumSiret(String numSiret) {
	this.numSiret = numSiret;
}
/**
 * cette methode permet de retourner la date de creation
 * @return renvoie la date de creation
 */
public Date getDateCreation() {
	return dateCreation;
}
/**
 * Cette methode permet de setter la date de creation
 * @param dateCreation la date de creation
 */
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}

}
