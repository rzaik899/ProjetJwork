package org.gestion.jparc.dao;

import java.util.List;

import org.gestion.jparc.entities.Association;
import org.gestion.jparc.entities.Entreprise;
import org.gestion.jparc.entities.Individu;
import org.gestion.jparc.entities.Profil;
import org.gestion.jparc.entities.User;
import org.gestion.jparc.models.Compte;

public interface UserDao {
	
	
	public void addUser(User c);
	 public void addAssociation(Association c);
	 public void addEntreprise(Entreprise c);
	 public void addIndividu(Individu c);
	 public void addProfil(Profil r);
	 public void addProfilToUser(String Matricule , int idProfil);
	 public User authentification(Compte c);

	 public User consulterUser (String Matricule);
	 public List<User> ConsulterUsers (String Profil);
	 public List<User> consulterAllUsers();
	 
	 public void bloqUser(String Matricule);
	 public void debloqUser(String Matricule);
	 // return list profit
	 public List<Profil> consulterAllProfits();
	

}
