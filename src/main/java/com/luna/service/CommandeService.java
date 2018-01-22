package com.luna.service;

import java.util.List;

import com.luna.entities.Commande;

public interface CommandeService {
	boolean add(Commande Comm);
	void update(Commande Comm);
	void delete(int idCommande);
	Commande get(int idCommande);
	List<Commande> listCommande();
}
