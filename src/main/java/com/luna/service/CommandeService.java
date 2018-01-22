package com.luna.service;

import java.util.List;

import com.luna.entities.Commande;

public interface CommandeService {
	String add(Commande Comm);
	String update(Commande Comm);
	String delete(int idCommande);
	Commande get(int idCommande);
	List<Commande> listCommande();
}
