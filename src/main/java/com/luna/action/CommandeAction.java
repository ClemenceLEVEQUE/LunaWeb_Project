package com.luna.action;
//package com.formation.action;
//
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.Results;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.luna.entities.Commande;
//import com.luna.traitement.CommandeTraitement;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//@Action("/ajoutModifCommande")
//
//@Results({ @Result(name = "success", location = "ajoutModifCommande.jsp")})
//public class CommandeAction extends ActionSupport implements ModelDriven<Commande>{
//
//	private static final long serialVersionUID = 1L;
//	private Commande commande;
//	@Autowired
//	private CommandeTraitement commandeTraitement;
//	
//	
//	@Override
//	public String execute() throws Exception {
//		commande = commandeTraitement.getTouteLigne();
//		return SUCCESS;
//	}
//	
//	
//	
//	
//	
//	public Commande getCommande() {
//		return commande;
//	}
//
//
//
//
//
//	public void setCommande(Commande commande) {
//		this.commande = commande;
//	}
//
//
//
//
//
//	public CommandeTraitement getCommandeTraitement() {
//		return commandeTraitement;
//	}
//
//
//
//
//
//	public void setCommandeTraitement(CommandeTraitement commandeTraitement) {
//		this.commandeTraitement = commandeTraitement;
//	}
//
//
//
//
//
//	@Override
//	public Commande getModel() {
//		
//		return commande;
//	}
//
//}
