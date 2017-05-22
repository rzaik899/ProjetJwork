package org.gestion.jparc.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="individu")
@PrimaryKeyJoinColumn(name = "Id_Client")
public class Individu extends Client {
	
	private String Nom;
	private String Prenom;
	public Individu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	

}
