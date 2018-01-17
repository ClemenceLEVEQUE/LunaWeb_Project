package com.luna.service;

import java.util.List;

import com.luna.entities.Commande;

public interface CommandeService {
	void add(Commande Comm);
	void update(Commande Comm);
	void delete(int idCommande);
	void get(int idCommande);
	List<Commande> listCommande();
}
