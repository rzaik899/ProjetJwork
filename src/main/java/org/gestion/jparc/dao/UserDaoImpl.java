package org.gestion.jparc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.gestion.jparc.entities.Association;
import org.gestion.jparc.entities.Entreprise;
import org.gestion.jparc.entities.Individu;
import org.gestion.jparc.entities.Profil;
import org.gestion.jparc.entities.User;
import org.gestion.jparc.models.Compte;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class UserDaoImpl implements UserDao{
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void addUser(User c) {
		em.persist(c);
	}

	@Override
	public void addAssociation(Association c) {
		em.persist(c);
	}

	@Override
	public void addEntreprise(Entreprise c) {
		em.persist(c);
	}

	@Override
	public void addIndividu(Individu c) {
		em.persist(c);
		
	}

	@Override
	public void addProfil(Profil r) {
		em.persist(r);
	}

	@Override
	public void addProfilToUser(String Matricule, int idProfil) {
		 User u=em.find(User.class,Matricule);
		 Profil p=em.find(Profil.class,idProfil);
		 u.setProfil(p);
		 em.merge(u);;
	}

	@Override
	public User authentification(Compte c) {
		Query req=em.createQuery("select u  from User u where u.Login like :X and u.Password like :Y");
		req.setParameter("X","%"+c.getLogin()+"%");
		req.setParameter("Y","%"+c.getPassword()+"%");
		return  (User) req.getResultList();
		
	}

	@Override
	public User consulterUser(String Matricule) {
		 User u=em.find(User.class,Matricule);
		return u ;
	}

	@Override
	public List<User> ConsulterUsers(String Profil) {
		Query req=em.createQuery("select u  from User u where u.profil like :X");
		req.setParameter("X","%"+Profil+"%");
		return  req.getResultList();
	}

	@Override
	public List<User> consulterAllUsers() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select u  from User u");
		return  req.getResultList();
	}

	@Override
	public void bloqUser(String Matricule) {
		User u=em.find(User.class,Matricule);
		u.setEtat_compte(false);
		em.merge(u);
		
	}

	@Override
	public void debloqUser(String Matricule) {
		
		User u=em.find(User.class,Matricule);
		u.setEtat_compte(true);
		em.merge(u);
	}
	@Override
	public List<Profil> consulterAllProfits() {
		Query req=em.createQuery("select u from Profit u");
		return (List<Profil>) req.getResultList();
	}

}
