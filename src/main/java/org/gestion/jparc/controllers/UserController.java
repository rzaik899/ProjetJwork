package org.gestion.jparc.controllers;



import org.gestion.jparc.metiers.UserMetier;
import org.gestion.jparc.models.ProfitModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
@Autowired
private UserMetier metier;

@RequestMapping(value="/profit")
public String  profit(ProfitModel profit,Model m)

{
	profit.setProfits(metier.consulterAllProfits());


	m.addAttribute("profit",profit);
		return "profit";
	
}




	

}
