package com.luna.dao;

import java.time.LocalDate;
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
			LocalDate date = LocalDate.now();
			Comm.setDateCom(date.toString());
			date.plusDays(5);
			Comm.setDateLivraison(date.toString());
			Comm.setNumCom(getNewNum());
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

	@Override
	public ArrayList<Commande> getSearch(String search) {
		return (ArrayList<Commande>) sessionFactory.getCurrentSession().createQuery("from Commande where numCom like '%" + search + "%'").getResultList();
	}

	@Override
	public String getNewNum() {
		List<String> str = sessionFactory.getCurrentSession().createQuery("select max(numCom) from Commande").getResultList();
		String num;
		List<String> test = new ArrayList<String>();
		test.add(null);
		if(str.get(0) == test.get(0)) {
			num = "COM00001";
		} else {
			num = str.get(0);
			num = num.substring(3);
			System.out.println(num);
			int i = Integer.parseInt(num);
			i += 1;
			num = "00000" + i;
			num = num.substring(num.length() - 5);
			num = "COM" + num;
		}
		return num;
	}
}
