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
	public String add(Commande Comm) {
		if(commandeDao.insertCommande(Comm)) {
			return "SUCCESS";
		} else return "ERROR";
	}

	@Override
	public String update(Commande Comm) {
		commandeDao.updateCommande(Comm);
		return "SUCCESS";
	}

	@Override
	public String delete(int idCommande) {
		commandeDao.removeCommande(idCommande);
		return "SUCCESS";
	}

	@Override
	public Commande get(int idCommande) {
		return commandeDao.getCommande(idCommande);
	}

	@Override
	public List<Commande> listCommande() {
		return commandeDao.getAllCommande();
	}
}
