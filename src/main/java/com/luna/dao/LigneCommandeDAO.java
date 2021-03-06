package com.luna.dao;

import java.util.ArrayList;

import com.luna.entities.LigneCommande;

public interface LigneCommandeDAO {

	public void insertLigneCommande(LigneCommande ligneCo);

	public void updateLigneCommande(LigneCommande ligneCo);

	public void removeLigneCommande(int idLigneCommande);

	public LigneCommande getLigneCommande(int idLigneCommande);

	public ArrayList<LigneCommande> getAllLignePourCommande(int idCommande);
}
