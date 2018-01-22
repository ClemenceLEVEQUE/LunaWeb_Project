package com.luna.action;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Commande;
import com.luna.service.CommandeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Results({ @Result(name = "success", location = "ajoutModifCommande.jsp"),
	@Result(name= "insert" , location = "listeCommande.jsp"),
	@Result(name="errorAdd", location = "ajouCommande.jsp"),
	@Result(name="delete" , location= "listeCommande.jsp"),
	@Result(name="update", location="modifCommande.jsp")
})
public class CommandeAction extends ActionSupport implements ModelDriven<Commande>{

	private static final long serialVersionUID = 1L;
	private Commande commande;
	@Autowired
	private CommandeService commandeService;
	 private List<Commande> AllCommande;

	
@Action("AffichageCommande")
	@Override
	public String execute() throws Exception {
		 AllCommande= commandeService.listCommande();
		return "success";
	}
	
	
	@Action("insertCom")
	public String insertCommande() throws Exception{
	return commandeService.add(commande);
	}
	
	@Action("deleteCom")
	public String deleteCommande() throws Exception{
		return commandeService.delete(commande.getIdCommande());
	}
	
	@Action("updateCom")
	public String updateCommande() throws Exception{
		return commandeService.update(commande);
	}
	

	
	
	
	
	
	public List<Commande> getAllCommande() {
		return AllCommande;
	}


	public void setAllCommande(List<Commande> allCommande) {
		AllCommande = allCommande;
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
