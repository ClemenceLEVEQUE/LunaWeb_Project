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
import com.luna.entities.LigneCommande;
import com.luna.service.ArticleService;
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
		@Result(name = "updateCom", location = "/jsp/modifCommande.jsp") })
public class CommandeAction extends ActionSupport implements ModelDriven<Commande> {

	private static final long serialVersionUID = 1L;
	private Commande commande;
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private ClientService clientService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private LigneCommandeService ligneCommandeService;
	private List<Commande> models;
	private List<Client> clients;
	private List<LigneCommande> lignes;
	private List<Article> articles;

	@Action("AffichageCommande")
	@Override
	public String execute() throws Exception {
		setModels();
		return "success";
	}

	@Action("insertCom")
	public String insertCommande() throws Exception {
		Client client = clientService.get(commande.getClient().getIdClient());
		commande.setClient(client);
		commande.setDateCom("");
		return commandeService.add(commande);
	}

	@Action("insertThisCom")
	public String insert() throws Exception {
		setClients();
		setModels();
		setLignes();
		setArticles();
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
	
	@Action("updateThisCom")
	public String update() throws Exception{
		setClients();
		setModels();
		setLignes();
		setArticles();
		return "updateCom";
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

	public void setLignes() {
		if(commande != null) {
			this.lignes = ligneCommandeService.listLigneCommande(commande.getIdCommande());
		}
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles() {
		this.articles = articleService.listArticle();
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
