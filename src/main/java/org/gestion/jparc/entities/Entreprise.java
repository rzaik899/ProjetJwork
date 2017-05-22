package org.gestion.jparc.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="entreprise")
@PrimaryKeyJoinColumn(name = "Id_Client")
public class Entreprise extends Client {

private String RS;	
private String RC;	
private String Secteur_activite;
@ManyToOne 
private Domaine domaine;
public String getRS() {
	return RS;
}
public Entreprise() {
	super();
	// TODO Auto-generated constructor stub
}
public void setRS(String rS) {
	RS = rS;
}
public String getRC() {
	return RC;
}
public void setRC(String rC) {
	RC = rC;
}
public String getSecteur_activite() {
	return Secteur_activite;
}
public void setSecteur_activite(String secteur_activite) {
	Secteur_activite = secteur_activite;
}
	
	
	
}
