package org.gestion.jparc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Profil implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Profil;
	private String Description;
	@OneToMany(mappedBy="profil")
	
	private List<User> Users;
	public Profil() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProfil() {
		return Profil;
	}
	public void setProfil(int profil) {
		Profil = profil;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	} 
	
	

}
