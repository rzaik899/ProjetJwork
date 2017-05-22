package org.gestion.jparc.models;

import java.util.Date;

import org.gestion.jparc.entities.Profil;

public class UserModel {
	private String Matricule;
	private String Nom;
	private String Prenom;
	private String CIN;
	
	private String CNSS;
	private String Tel;
	private String Login;
	private String Email;
	private String Password;
	private Date Date_entree;
	private Double Salaire;
	private Boolean Image;
	private Boolean Etat_compte;
	private Profil profil;
	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String matricule) {
		Matricule = matricule;
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
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getCNSS() {
		return CNSS;
	}
	public void setCNSS(String cNSS) {
		CNSS = cNSS;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Date getDate_entree() {
		return Date_entree;
	}
	public void setDate_entree(Date date_entree) {
		Date_entree = date_entree;
	}
	public Double getSalaire() {
		return Salaire;
	}
	public void setSalaire(Double salaire) {
		Salaire = salaire;
	}
	public Boolean getImage() {
		return Image;
	}
	public void setImage(Boolean image) {
		Image = image;
	}
	public Boolean getEtat_compte() {
		return Etat_compte;
	}
	public void setEtat_compte(Boolean etat_compte) {
		Etat_compte = etat_compte;
	}
	public UserModel(String matricule, String nom, String prenom, String cIN,
			String cNSS, String tel, String login, String email,
			String password, Date date_entree, Double salaire, Boolean image,
			Boolean etat_compte, Profil profil) {
		super();
		Matricule = matricule;
		Nom = nom;
		Prenom = prenom;
		CIN = cIN;
		CNSS = cNSS;
		Tel = tel;
		Login = login;
		Email = email;
		Password = password;
		Date_entree = date_entree;
		Salaire = salaire;
		Image = image;
		Etat_compte = etat_compte;
		this.profil = profil;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
}
