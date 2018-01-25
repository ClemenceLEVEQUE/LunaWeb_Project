package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Client;
import com.luna.service.ClientService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({ @Result(name = "success", location = "/jsp/listeClient.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "AffichageClient.action"),
		@Result(name = "errorAdd", location = "/jsp/ajoutClient.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "AffichageClient.action"),
		@Result(name = "errorDelete", type = "redirectAction", location = "AffichageClient.action"),
		@Result(name = "updateClient", location = "/jsp/modifClient.jsp"),
		@Result(name = "update", type = "redirectAction", location = "AffichageClient.action") })

public class ClientAction extends ActionSupport implements ModelDriven<Client> {

	private static final long serialVersionUID = 1L;

	private Client client;
	@Autowired
	private ClientService clientService;

	private List<Client> models;

	@Action("AffichageClient")
	@Override
	public String execute() throws Exception {
		setModels();
		return "success";
	}

	@Action("insertClient")
	public String insertClient() throws Exception {
		return clientService.add(client);
	}

	@Action("deleteClient")
	public String delete() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		return clientService.delete(id);
	}

	@Action("updateClient")
	public String updateClient() throws Exception {
		return clientService.update(client);
	}

	@Action("updateThisClient")
	public String update() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		client = clientService.get(id);
		return "updateClient";
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

	public List<Client> getModels() {
		return models;
	}

	public void setModels(List<Client> models) {
		this.models = models;
	}

	public void setModels() {
		this.models = clientService.listClient();
	}

	@Override
	public Client getModel() {
		return client;
	}

}
