package com.luna.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;


import com.luna.entities.Client;
import com.luna.service.ClientService;
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
	private ClientService clientService;
	
	private List<Client> Allclient;
	

	@Override
	public String execute() throws Exception {
		Allclient = clientService.listClient();
		return "success";
	}
	
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public List<Client> getAllclient() {
		return Allclient;
	}

	public void setAllclient(List<Client> allclient) {
		Allclient = allclient;
	}

	@Override
	public Client getModel() {
		return client;
	}

}
