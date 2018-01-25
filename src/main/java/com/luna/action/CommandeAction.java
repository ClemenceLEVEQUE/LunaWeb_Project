package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;
import com.luna.entities.Client;
import com.luna.entities.Commande;
import com.luna.service.ArticleService;
import com.luna.service.ClientService;
import com.luna.service.CommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({ @Result(name = "success", location = "/jsp/listeCommande.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "/AffichageCommande.action"),
		@Result(name = "insertCom", location = "/jsp/ajoutCommande.jsp"),
		@Result(name = "errorAdd", location = "/jsp/ajoutCommande.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "/AffichageCommande.action"),
		@Result(name = "update", type = "redirectAction", location = "/AffichageCommande.action") })
public class CommandeAction extends ActionSupport implements ModelDriven<Commande> {

	private static final long serialVersionUID = 1L;
	private Commande commande;
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private ClientService clientService;
	private List<Commande> models;
	private List<Article> articles;
	private List<String> clients;

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

	@Action("insertThisCom")
	public String insert() throws Exception {
		setArticles();
		setClients();
		setModels();
		return "insertCom";
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

	public void setModels() {
		this.models = commandeService.listCommande();
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles() {
		this.articles = articleService.listArticle();
	}
	
	public List<String> getClients(){
		return clients;
	}

	public void setClients() {
		clients = clientService.listCode();
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
