package org.gestion.jparc.models;

public class Compte {
	private String login;
	public Compte(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	private String password;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
