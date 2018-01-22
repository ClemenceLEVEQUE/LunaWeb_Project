package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Client;
import com.luna.entities.Commande;
import com.luna.traitement.ClientTraitement;
import com.luna.traitement.CommandeTraitement;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Action("/ajoutModifClient")

@Results({ @Result(name = "success", location = "ajoutModifClient.jsp")})
public class ClientAction extends ActionSupport implements ModelDriven<Client>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Client client;
	@Autowired
	private ClientTraitement clientTraitement;
	
	
	
	
	
	
	@Override
	public String execute() throws Exception {
		client = ClientTraitement.Afficher();
		return SUCCESS;
	}
	
	public Client getClient() {
		return client;
	}







	public void setClient(Client client) {
		this.client = client;
	}







	public ClientTraitement getClientTraitement() {
		return clientTraitement;
	}







	public void setClientTraitement(ClientTraitement clientTraitement) {
		this.clientTraitement = clientTraitement;
	}







	@Override
	public Client getModel() {
		return client;
	}

}
