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
	public void add(LigneCommande ligneCo) {
		ligneCommandeDAO.insertLigneCommande(ligneCo);
	}

	@Override
	public void update(LigneCommande ligneCo) {
		ligneCommandeDAO.updateLigneCommande(ligneCo);
	}

	@Override
	public void delete(int idLigneCommande) {
		ligneCommandeDAO.removeLigneCommande(idLigneCommande);
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
