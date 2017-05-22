package org.gestion.jparc;

import org.gestion.jparc.dao.UserDao;
import org.gestion.jparc.dao.UserDaoImpl;
import org.gestion.jparc.entities.User;
import org.gestion.jparc.metiers.UserMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		
		UserMetier metier=(UserMetier) context.getBean("metier");
		metier.consulterAllProfits();

	}

}
