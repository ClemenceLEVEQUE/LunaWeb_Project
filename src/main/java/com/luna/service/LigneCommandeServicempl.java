package com.luna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luna.dao.LigneCommandeDAO;
import com.luna.entities.LigneCommande;

@Service
@Transactional
public class LigneCommandeServicempl implements LigneCommandeService {
	@Autowired
	private LigneCommandeDAO ligneCommandeDAO;
	
	@Override
	public String add(LigneCommande ligneCo) {
		ligneCommandeDAO.insertLigneCommande(ligneCo);
		return "insert";
	}

	@Override
	public String update(LigneCommande ligneCo) {
		ligneCommandeDAO.updateLigneCommande(ligneCo);
		return "update";
	}

	@Override
	public String delete(int idLigneCommande) {
		ligneCommandeDAO.removeLigneCommande(idLigneCommande);
		return "delete";
	}

	@Override
	public LigneCommande get(int idLigneCommande) {
		return ligneCommandeDAO.getLigneCommande(idLigneCommande);
	}

	@Override
	public List<LigneCommande> listLigneCommande(int idCommande) {
		return ligneCommandeDAO.getAllLignePourCommande(idCommande);
	}
}
