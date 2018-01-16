package com.luna.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**La classe Article correspond au Article � disposition des client.
* Il est caract�ris� par les informations suivantes:
* 
* l'idArticle correspondant � l'identifiant de l'article
* la categorie de l'article (categorie);
* le code de l'article (codeArt);
* le nom de l'article (nomArticle);
* le Prix (prixUnitaire);
* le stock disponible(stock);
* */


@Entity
public class Article implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int idArticle;
	private String categorie;
	private String codeArt;
	private String nomArticle;
	private float prixUnitaire;
	private int stock;

	public Article() {
		super();
	}

	public Article(String categorie, String codeArt, String nomArticle, float prixUnitaire, int stock) {
		super();
		this.categorie = categorie;
		this.codeArt = codeArt;
		this.nomArticle = nomArticle;
		this.prixUnitaire = prixUnitaire;
		this.stock = stock;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getCodeArt() {
		return codeArt;
	}

	public void setCodeArt(String codeArt) {
		this.codeArt = codeArt;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Article(int idArticle, String categorie, String codeArt, String nomArticle, float prixUnitaire, int stock) {
		super();
		this.idArticle = idArticle;
		this.categorie = categorie;
		this.codeArt = codeArt;
		this.nomArticle = nomArticle;
		this.prixUnitaire = prixUnitaire;
		this.stock = stock;
	}

	
	
}
