package com.luna.dao;

import java.util.ArrayList;

import com.luna.entities.Commande;

public interface CommandeDAO {
	public boolean insertCommande(Commande Comm);
	public void updateCommande(Commande Comm);
	public void removeCommande(int idCommande);
	public Commande getCommande(int idCommande);
	public String getNewNum();
	public ArrayList<Commande> getAllCommande();
	public ArrayList<Commande> getSearch(String search);
}
