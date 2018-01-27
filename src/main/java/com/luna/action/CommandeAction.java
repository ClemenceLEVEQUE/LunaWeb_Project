package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Client;
import com.luna.entities.Commande;
import com.luna.entities.LigneCommande;
import com.luna.service.ClientService;
import com.luna.service.CommandeService;
import com.luna.service.LigneCommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({ @Result(name = "success", location = "/jsp/listeCommande.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "insertCom", location = "/jsp/ajoutCommande.jsp"),
		@Result(name = "errorAdd", location = "/jsp/ajoutCommande.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "update", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "updateCom", location = "/jsp/modifCommande.jsp"),
		@Result(name = "affiche", location = "/jsp/ficheCommande.jsp") })
public class CommandeAction extends ActionSupport implements ModelDriven<Commande> {

	private static final long serialVersionUID = 1L;
	private Commande commande = new Commande();
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private LigneCommandeService ligneCommandeService;
	private List<Commande> models;
	private List<Client> clients;
	private List<LigneCommande> lignes;

	@Action("AffichageCommande")
	@Override
	public String execute() throws Exception {
		setModels();
		return "success";
	}

	@Action("insertCom")
	public String insertCommande() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("cli"));
		Client client = clientService.get(id);
		commande.setClient(client);
		return commandeService.add(commande);
	}

	@Action("insertThisCom")
	public String insert() throws Exception {
		setClients();
		return "insertCom";
	}

	@Action("deleteCom")
	public String deleteCommande() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		return commandeService.delete(id);
	}

	@Action("updateCom")
	public String updateCommande() throws Exception {
		int cli = Integer.parseInt(ServletActionContext.getRequest().getParameter("cli"));
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		commande = commandeService.get(id);
		Client client = clientService.get(cli);
		commande.setClient(client);
		return commandeService.update(commande);
	}
	
	@Action("updateThisCom")
	public String update() throws Exception{
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		commande = commandeService.get(id);
		setClients();
		return "updateCom";
	}

	@Action("ficheCommande")
	public String affiche() throws Exception{
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		commande = commandeService.get(id);
		setLignes(id);
		return "affiche";
	}
	
	public List<Commande> getModels() {
		return models;
	}

	public void setModels() {
		this.models = commandeService.listCommande();
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients() {
		this.clients = clientService.listClient();
	}

	public List<LigneCommande> getLignes() {
		return lignes;
	}

	public void setLignes(int id) {
		if(commande != null) {
			this.lignes = ligneCommandeService.listLigneCommande(id);
		}
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public Commande getModel() {
		return commande;
	}

}
