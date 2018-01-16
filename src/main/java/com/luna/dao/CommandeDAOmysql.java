package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Commande;

@Repository
public class CommandeDAOmysql implements CommandeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertCommande(Commande Comm) {
		sessionFactory.getCurrentSession().save(Comm);
	}

	@Override
	public void updateCommande(Commande Comm) {
		sessionFactory.getCurrentSession().update(Comm);
	}

	@Override
	public void removeCommande(int idCommande) {
		// TODO
		//sessionFactory.getCurrentSession().createQuery("delete from Commande where idCommande = " + idCommande).executeUpdate();
	}

	@Override
	public Commande getCommande(int idCommande) {
		return sessionFactory.getCurrentSession().get(Commande.class, idCommande);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Commande> getAllCommande() {
		return (ArrayList<Commande>) sessionFactory.getCurrentSession().createQuery("from Commande").getResultList();
	}
}
