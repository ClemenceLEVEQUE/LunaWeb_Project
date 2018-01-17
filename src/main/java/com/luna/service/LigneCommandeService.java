package com.luna.service;

import java.util.List;

import com.luna.entities.LigneCommande;

public interface LigneCommandeService {
	void add(LigneCommande ligneCo);
	void update(LigneCommande ligneCo);
	void delete(int idLigneCommande);
	void get(int idLigneCommande);
	List<LigneCommande> listLigneCommande(int idCommande);
}
