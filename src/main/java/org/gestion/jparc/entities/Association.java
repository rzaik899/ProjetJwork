package org.gestion.jparc.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="association")
@PrimaryKeyJoinColumn(name = "Id_Client")
public class Association extends Client {
	
private String nom;
private String Date_fondation;
public Association() {
	super();
	// TODO Auto-generated constructor stub
}
private String But_association;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getDate_fondation() {
	return Date_fondation;
}
public void setDate_fondation(String date_fondation) {
	Date_fondation = date_fondation;
}
public String getBut_association() {
	return But_association;
}
public void setBut_association(String but_association) {
	But_association = but_association;
}

	

}
