package com.luna.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 * 
 * @author Clemence et Karim ProjetLuna
 *
 *         La classe Commande correspond au Commande des clients
 *
 *         Il est caract�ris� par les informations suivantes: idCommande qui est
 *         l'identifiant de la commande. id Client corresqpondant �
 *         l'identifiant du client dateLivraison li�s � la date de livraison
 *         dateCom correspondant � la date de la commande etat qui est l'�tat de
 *         la commande sp�cifi� par 1 caract�re. numComm est le numero de la
 *         Commande total correspond au prix total de la commande
 *
 */

@Entity

public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * L'ID Commande n'est pas modifiable
	 */
	@Id
	@GeneratedValue
	private int idCommande;
	
	@OneToOne
	private Client client;
	private String dateLivraison;
	private String dateCom;
	private char etat;
	private String numCom;
	private float total;

	/**
	 * On creer un constructeur par default de commande
	 * 
	 */
	@OneToMany(cascade = CascadeType.ALL)
	private List <LigneCommande>  lignes;
	
	public Commande() {
		super();
	}

	/**
	 * On creer un constructeur Commande avec l'ensemble des parametres except�
	 * l'IdCommande.
	 * 
	 * @param idClient
	 * @param dateLivraison
	 * @param datCom
	 * @param etat
	 * @param numCom
	 * @param total
	 * 
	 */
	public Commande(Client client, String dateLivraison, String dateCom, char etat, String numCom, float total) {
		super();
		this.client = client;
		this.dateLivraison = dateLivraison;
		this.dateCom = dateCom;
		this.etat = etat;
		this.numCom = numCom;
		this.total = total;
	}

	/**
	 * Recuperation de L'IDcommande
	 * 
	 * @return idCommande
	 */
	public int getIdCommande() {
		return idCommande;
	}

	/**
	 * Modification de L'IDcommande
	 * 
	 * @param idCommande
	 */
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	/**
	 * Recuperation de L'iDClient
	 * 
	 * @return idClient
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Modification du Client
	 * 
	 * @param Client
	 */

	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Recuperation de DateLivraison
	 * 
	 * @return La date de livraison
	 */

	public String getDateLivraison() {
		return dateLivraison;
	}

	/**
	 * Modification de DateLivraison
	 * 
	 * @param La
	 *            date de livraison
	 */

	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	/**
	 * Recuperation de DateCom
	 * 
	 * @return La date de commande
	 */
	public String getDateCom() {
		return dateCom;
	}

	/**
	 * Modification de DateLivraison
	 * 
	 * @param La
	 *            date de commande
	 */

	public void setDateCom(String dateCom) {
		this.dateCom = dateCom;
	}

	/**
	 * Recuperation de Etat
	 * 
	 * @return l'etat de la commande
	 */
	public char getEtat() {
		return etat;
	}

	/**
	 * Modification de Etat
	 * 
	 * @param l'etat
	 *            de la commande
	 */
	public void setEtat(char etat) {
		this.etat = etat;
	}

	/**
	 * Recuperation de NumCom
	 * 
	 * @return le numero de la commande
	 */

	public String getNumCom() {
		return numCom;
	}

	/**
	 * Modification de NumCom
	 * 
	 * @param le
	 *            numero de la commande
	 */
	public void setNumCom(String numCom) {
		this.numCom = numCom;
	}

	/**
	 * Recuperation du total de la commande
	 * 
	 * @return le totale de la commande
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * Modification du total de la commande
	 * 
	 * @param le
	 *            Prix totale de la commande
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	/*
	 * * On creer un constructeur Commande avec l'ensemble des parametres pour faire
	 * fonctionner la methode updateCommande
	 * 
	 * @param idCommande
	 * 
	 * @param idClient
	 * 
	 * @param dateLivraison
	 * 
	 * @param datCom
	 * 
	 * @param etat
	 * 
	 * @param numCom
	 * 
	 * @param total
	 * 
	 * @see updateCommande
	 */
	public Commande(int idCommande, Client client, String dateLivraison, String dateCom, char etat, String numCom,
			float total) {
		super();
		this.idCommande = idCommande;
		this.client = client;
		this.dateLivraison = dateLivraison;
		this.dateCom = dateCom;
		this.etat = etat;
		this.numCom = numCom;
		this.total = total;
	}

}
