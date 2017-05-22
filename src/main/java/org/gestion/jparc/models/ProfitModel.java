package org.gestion.jparc.models;

import java.util.List;

import org.gestion.jparc.entities.Profil;

public class ProfitModel {
	
	private int Profit;
	private String Description;

	private List<Profil> profits;

	public ProfitModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfitModel(int profil, String description,
			List<org.gestion.jparc.entities.Profil> profils) {
		super();
		Profit = profil;
		Description = description;
		this.profits = profils;
	}

	public int getProfit() {
		return Profit;
	}

	public void setProfit(int profil) {
		Profit = profil;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<Profil> getProfits() {
		return profits;
	}

	public void setProfits(List<Profil> profils) {
		this.profits = profils;
	}
}
