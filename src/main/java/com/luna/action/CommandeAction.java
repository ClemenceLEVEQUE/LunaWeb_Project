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

@Results({ @Result(name = "success", location = "/WEB-INF/jsp/listeCommande.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "insertCom", location = "/WEB-INF/jsp/ajoutCommande.jsp"),
		@Result(name = "errorAdd", location = "/WEB-INF/jsp/ajoutCommande.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "update", type = "redirectAction", location = "AffichageCommande"),
		@Result(name = "updateCom", location = "/WEB-INF/jsp/modifCommande.jsp"),
		@Result(name = "affiche", location = "/WEB-INF/jsp/ficheCommande.jsp"),
		@Result(name = "research", location = "/WEB-INF/jsp/listeCommande.jsp"),
		@Result(name = "notlogged", type = "redirectAction", location = "index") })
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
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			setModels();
			return "success";
		}
	}

	@Action("insertCom")
	public String insertCommande() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("cli"));
			Client client = clientService.get(id);
			commande.setClient(client);
			return commandeService.add(commande);
		}
	}

	@Action("insertThisCom")
	public String insert() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			setClients();
			return "insertCom";
		}
	}

	@Action("deleteCom")
	public String deleteCommande() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			return commandeService.delete(id);	
		}
	}

	@Action("updateCom")
	public String updateCommande() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			int cli = Integer.parseInt(ServletActionContext.getRequest().getParameter("cli"));
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			commande = commandeService.get(id);
			Client client = clientService.get(cli);
			commande.setClient(client);
			return commandeService.update(commande);
		}
	}
	
	@Action("updateThisCom")
	public String update() throws Exception{
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			commande = commandeService.get(id);
			setClients();
			return "updateCom";
		}
	}

	@Action("ficheCommande")
	public String affiche() throws Exception{
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			commande = commandeService.get(id);
			setLignes(id);
			return "affiche";
		}
	}
	
	@Action("searchCom")
	public String search() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			String search = ServletActionContext.getRequest().getParameter("Search");
			setModels(commandeService.search(search));
			return "research";
		}
	}
	
	public List<Commande> getModels() {
		return models;
	}

	public void setModels() {
		this.models = commandeService.listCommande();
	}

	public void setModels(List<Commande> commandes) {
		this.models = commandes;
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
