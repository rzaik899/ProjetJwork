package org.gestion.jparc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Domaine implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Domaine;
	private String Description;
	
	
	
@OneToMany(mappedBy="domaine")
	
	private List<Entreprise> entreprises;
	public int getDomaine() {
		return Domaine;
	}
	public void setDomaine(int domaine) {
		Domaine = domaine;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
