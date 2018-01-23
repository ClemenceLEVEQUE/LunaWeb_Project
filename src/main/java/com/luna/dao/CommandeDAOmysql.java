package com.luna.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Commande;

@Repository
@SuppressWarnings("unchecked")
public class CommandeDAOmysql implements CommandeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean insertCommande(Commande Comm) {
		List<Commande> cmde = sessionFactory.getCurrentSession().createQuery("from Commande where numCom = " + Comm.getNumCom()).getResultList();
		if(cmde.isEmpty()) {
			sessionFactory.getCurrentSession().save(Comm);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateCommande(Commande Comm) {
		sessionFactory.getCurrentSession().update(Comm);
	}

	@Override
	public void removeCommande(int idCommande) {
		Commande cmde = sessionFactory.getCurrentSession().get(Commande.class, idCommande);
		sessionFactory.getCurrentSession().delete(cmde);
	}

	@Override
	public Commande getCommande(int idCommande) {
		return sessionFactory.getCurrentSession().get(Commande.class, idCommande);
	}

	@Override
	public ArrayList<Commande> getAllCommande() {
		return (ArrayList<Commande>) sessionFactory.getCurrentSession().createQuery("from Commande").getResultList();
	}
}
