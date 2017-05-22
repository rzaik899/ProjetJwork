package org.gestion.jparc.metiers;

import java.util.List;

import org.gestion.jparc.dao.UserDao;
import org.gestion.jparc.entities.Association;
import org.gestion.jparc.entities.Entreprise;
import org.gestion.jparc.entities.Individu;
import org.gestion.jparc.entities.Profil;
import org.gestion.jparc.entities.User;
import org.gestion.jparc.models.Compte;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class UserMetierImpl  implements UserMetier{

	
	private UserDao jparcdao;
	public void setJparcdao(UserDao jparcdao) {
		this.jparcdao = jparcdao;
	}

	@Override
	
	public void addUser(User c) {
		jparcdao.addUser(c);
	}

	@Override

	public void addAssociation(Association c) {
		jparcdao.addAssociation(c);
	}

	@Override

	public void addEntreprise(Entreprise c) {
		jparcdao.addEntreprise(c);
	}

	@Override
	
	public void addIndividu(Individu c) {
		jparcdao.addIndividu(c);
	}

	@Override
	
	public void addProfil(Profil r) {
		jparcdao.addProfil(r);
	}

	@Override

  public void addProfilToUser(String Matricule, int idProfil) {
		jparcdao.addProfilToUser(Matricule, idProfil);
	}

	@Override

	public User authentification(Compte c) {
		// TODO Auto-generated method stub
		return jparcdao.authentification(c);
	}

	@Override
	
	public User consulterUser(String Matricule) {
		// TODO Auto-generated method stub
		return jparcdao.consulterUser(Matricule);
	}

	@Override

	public List<User> ConsulterUsers(String Profil) {
		// TODO Auto-generated method stub
		return jparcdao.ConsulterUsers(Profil);
	}

	@Override

	public List<User> consulterAllUsers() {
		// TODO Auto-generated method stub
		return jparcdao.consulterAllUsers();
	}

	@Override
	public void bloqUser(String Matricule) {
		jparcdao.bloqUser(Matricule);
	}

	@Override
	
	public void debloqUser(String Matricule) {
		jparcdao.debloqUser(Matricule);
	}

	@Override
	
	public List<Profil> consulterAllProfits() {
		// TODO Auto-generated method stub
		return jparcdao.consulterAllProfits();
	}

}
