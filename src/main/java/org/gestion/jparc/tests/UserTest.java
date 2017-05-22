package org.gestion.jparc.tests;

import static org.junit.Assert.*;

import org.gestion.jparc.entities.User;
import org.gestion.jparc.metiers.UserMetier;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest {
 @Autowired 
 private UserMetier metier;
	@Test
public void addUser() {
User u=new User();
u.setMatricule("OI98");
u.setPrenom("Khadija");
metier.addUser(u);

		
	}
	
	
@Test
public void test() {


		
}


}
