package com.luna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luna.dao.CommandeDAO;
import com.luna.entities.Commande;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {
	@Autowired
	private CommandeDAO commandeDao;

	@Override
	public void add(Commande Comm) {
		commandeDao.insertCommande(Comm);
	}

	@Override
	public void update(Commande Comm) {
		commandeDao.updateCommande(Comm);
	}

	@Override
	public void delete(int idCommande) {
		commandeDao.removeCommande(idCommande);
	}

	@Override
	public void get(int idCommande) {
		commandeDao.getCommande(idCommande);
	}

	@Override
	public List<Commande> listCommande() {
		return commandeDao.getAllCommande();
	}
}
