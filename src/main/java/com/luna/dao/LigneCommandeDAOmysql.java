package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.LigneCommande;

@Repository
public class LigneCommandeDAOmysql implements LigneCommandeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertLigneCommande(LigneCommande ligneCo) {
		sessionFactory.getCurrentSession().save(ligneCo);
	}

	@Override
	public void updateLigneCommande(LigneCommande ligneCo) {
		sessionFactory.getCurrentSession().update(ligneCo);
	}

	@Override
	public void removeLigneCommande(int idLigneCommande) {
		sessionFactory.getCurrentSession().createQuery("delete from LigneCommande where idLigne = " + idLigneCommande).executeUpdate();
	}

	@Override
	public LigneCommande getLigneCommande(int idLigneCommande) {
		return sessionFactory.getCurrentSession().get(LigneCommande.class, idLigneCommande);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<LigneCommande> getAllLignePourCommande(int idCommande) {
		return (ArrayList<LigneCommande>) sessionFactory.getCurrentSession().createQuery("from LigneCommande where commande_idCommande = " + idCommande).getResultList();
	}

}
