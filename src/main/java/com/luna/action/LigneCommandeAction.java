package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;
import com.luna.entities.Commande;
import com.luna.entities.LigneCommande;
import com.luna.service.ArticleService;
import com.luna.service.CommandeService;
import com.luna.service.LigneCommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results(value = { @Result(name = "insert", type = "redirectAction", location = "ficheCom"),
		@Result(name = "update", type = "redirectAction", location = "ficheCom"),
		@Result(name = "delete", type = "redirectAction", location = "ficheCom"),
		@Result(name = "insertLig", location = "/jsp/ajoutLigne.jsp"),
		@Result(name = "updateLig", location = "/jsp/modifLigne.jsp") })
public class LigneCommandeAction extends ActionSupport implements ModelDriven<LigneCommande> {

	private static final long serialVersionUID = 1L;
	private LigneCommande ligneCommande = new LigneCommande();
	@Autowired
	private LigneCommandeService ligneCommandeService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommandeService commandeService;
	private List<Article> articles;
	private List<Commande> commandes;

	@Action("insertLig")
	public String insertLig() throws Exception {
		int com = Integer.parseInt(ServletActionContext.getRequest().getParameter("Com"));
		int art = Integer.parseInt(ServletActionContext.getRequest().getParameter("Art"));
		int qte = Integer.parseInt(ServletActionContext.getRequest().getParameter("Qte"));
		ligneCommande.setIdCommande(commandeService.get(com));
		ligneCommande.setIdArticle(articleService.get(art));
		ligneCommande.setQuantite(qte);
		return ligneCommandeService.add(ligneCommande);
	}

	@Action("insertThisLig")
	public String insert() throws Exception {
		setArticles();
		setCommandes();
		return "insertLig";
	}

	@Action("updateLig")
	public String modifLig() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		int com = Integer.parseInt(ServletActionContext.getRequest().getParameter("Com"));
		int art = Integer.parseInt(ServletActionContext.getRequest().getParameter("Art"));
		int qte = Integer.parseInt(ServletActionContext.getRequest().getParameter("Qte"));
		ligneCommande.setIdCommande(commandeService.get(com));
		ligneCommande.setIdArticle(articleService.get(art));
		ligneCommande.setQuantite(qte);
		ligneCommande.setIdLigne(id);
		return ligneCommandeService.update(ligneCommande);
	}

	@Action("updateThisLig")
	public String update() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		ligneCommande = ligneCommandeService.get(id);
		setArticles();
		setCommandes();
		return "updateLig";
	}

	@Action("supprLig")
	public String supprLig() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		return ligneCommandeService.delete(id);
	}

	@Override
	public LigneCommande getModel() {
		return ligneCommande;
	}

	public LigneCommande getLigneCommande() {
		return ligneCommande;
	}

	public void setLigneCommande(LigneCommande ligneCommande) {
		this.ligneCommande = ligneCommande;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles() {
		articles = articleService.listArticle();
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes() {
		commandes = commandeService.listCommande();
	}
}
