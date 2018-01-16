package com.luna.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class LigneCommande implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int idLigne;
	private Commande commande;

	private Article article;
	private int quantite;

	public LigneCommande() {
		super();
	}

	public LigneCommande(int idCommande, int idArticle, int quantite) {
		super();
		this.commande = idCommande;
		this.idArticle = idArticle;
		this.quantite = quantite;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdLigne() {
		return idLigne;
	}

	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public LigneCommande(int idCommande, int idLigne, int idArticle, int quantite) {
		super();
		this.idCommande = idCommande;
		this.idLigne = idLigne;
		this.idArticle = idArticle;
		this.quantite = quantite;
	}

	
	
	
}
