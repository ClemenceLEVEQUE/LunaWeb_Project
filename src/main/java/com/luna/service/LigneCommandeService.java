package com.luna.service;

import java.util.List;

import com.luna.entities.LigneCommande;

public interface LigneCommandeService {
	String add(LigneCommande ligneCo);
	String update(LigneCommande ligneCo);
	String delete(int idLigneCommande);
	LigneCommande get(int idLigneCommande);
	List<LigneCommande> listLigneCommande(int idCommande);
}
