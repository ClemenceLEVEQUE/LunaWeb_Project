package com.luna.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;
import com.luna.entities.LigneCommande;
import com.luna.service.LigneCommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results(value = { @Result(name = "insert", type = "redirectAction", location = "updateThisCom"),
		@Result(name = "update", type = "redirectAction", location = "updateThisCom"),
		@Result(name = "delete", type = "redirectAction", location = "updateThisCom") })
public class LigneCommandeAction extends ActionSupport implements ModelDriven<LigneCommande> {

	private static final long serialVersionUID = 1L;
	private LigneCommande ligneCommande;
	@Autowired
	private LigneCommandeService ligneCommandeService;

	@Action("insertLig")
	public String insertLig() throws Exception {
		return ligneCommandeService.add(ligneCommande);
	}

	@Action("modifLig")
	public String modifLig() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		ligneCommande = ligneCommandeService.get(id);
		return ligneCommandeService.update(ligneCommande);
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

	public LigneCommandeService getLigneCommandeService() {
		return ligneCommandeService;
	}

	public void setLigneCommandeService(LigneCommandeService ligneCommandeService) {
		this.ligneCommandeService = ligneCommandeService;
	}
}
