package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Commande;
import com.luna.service.CommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({ @Result(name = "success", location = "/listeCommande.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "/AffichageCommande.action"),
		@Result(name = "errorAdd", location = "/ajoutCommande.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "/AffichageCommande.action"),
		@Result(name = "update", type = "redirectAction", location = "/AffichageCommande.action") })
public class CommandeAction extends ActionSupport implements ModelDriven<Commande> {

	private static final long serialVersionUID = 1L;
	private Commande commande;
	@Autowired
	private CommandeService commandeService;
	private List<Commande> models;

	@Action("AffichageCommande")
	@Override
	public String execute() throws Exception {
		setModels();
		return "success";
	}

	@Action("insertCom")
	public String insertCommande() throws Exception {
		return commandeService.add(commande);
	}

	@Action("deleteCom")
	public String deleteCommande() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		return commandeService.delete(id);
	}

	@Action("updateCom")
	public String updateCommande() throws Exception {
		return commandeService.update(commande);
	}

	public List<Commande> getModels() {
		return models;
	}

	public void setModels(List<Commande> models) {
		this.models = models;
	}

	public void setModels() {
		this.models = commandeService.listCommande();
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public CommandeService getCommandeService() {
		return commandeService;
	}

	public void setCommandeService(CommandeService commandeService) {
		this.commandeService = commandeService;
	}

	@Override
	public Commande getModel() {

		return commande;
	}

}
