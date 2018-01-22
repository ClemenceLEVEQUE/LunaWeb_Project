package com.luna.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Service;

@Entity
public class LigneCommande implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int idLigne;
	@ManyToOne
	private Commande commande;
	@OneToOne
	private Article article;
	private int quantite;

	public LigneCommande() {
		super();
	}

	public LigneCommande(Commande commande, Article article, int quantite) {
		super();
		this.commande = commande;
		this.article = article;
		this.quantite = quantite;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setIdCommande(Commande commande) {
		this.commande = commande;
	}

	public int getIdLigne() {
		return idLigne;
	}

	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}

	public Article getArticle() {
		return article;
	}

	public void setIdArticle(Article article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public LigneCommande(Commande commande, int idLigne, Article article, int quantite) {
		super();
		this.commande = commande;
		this.idLigne = idLigne;
		this.article = article;
		this.quantite = quantite;
	}

	
	
	
}
