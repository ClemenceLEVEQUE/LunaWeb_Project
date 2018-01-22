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



@Results({ @Result(name = "success", location = "listeClient.jsp"),
	@Result(name= "insert" , location = "listeClient.jsp"),
	@Result(name="errorAdd", location = "ajoutClient.jsp"),
	@Result(name="delete" , location= "listeClient.jsp"),
	@Result(name="errorDelete" , location="listeClient.jsp"),
	@Result(name="update", location="modifClient.jsp")

	})

public class ClientAction extends ActionSupport implements ModelDriven<Client>{


	private static final long serialVersionUID = 1L;

	private Client client;
	@Autowired
	private ClientService clientService;
	
	private List<Client> Allclient;
	

@Action("AffichageClient")
	@Override
	public String execute() throws Exception {
		Allclient = clientService.listClient();
		return "success";
	}
	
	@Action("insertClient")
	public String insertClient() throws Exception {
		return clientService.add(client);
	}
	
	@Action("deleteClient")
	public String delete() throws Exception{
		return clientService.delete(client.getIdClient());
	}
	
	@Action("updateClient")
	public String updateClient() throws Exception {
		return clientService.update(client);
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
