package com.luna.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String login;
	private String mdp;
	private int rang;

	public User() {
		super();
	}

	public User(String login, String mdp, int rang) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.rang = rang;
	}
	
	public User(String login, String pwd) {
		this.login = login;
		this.mdp = pwd;
		this.rang = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}
}
