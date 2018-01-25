package com.luna.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Client;
import com.luna.entities.Commande;

@Repository
@SuppressWarnings("unchecked")
public class ClientDAOmysql implements ClientDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean insertClient(Client Cli) {
		List<Client> client = sessionFactory.getCurrentSession().createQuery("from Client where codeClient = '" + Cli.getCodeClient() + "'").getResultList();
		if(client.isEmpty()) {
			sessionFactory.getCurrentSession().save(Cli);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateClient(Client Cli) {
		sessionFactory.getCurrentSession().update(Cli);
	}

	@Override
	public boolean removeClient(int idClient) {
		List<Commande> cmde = sessionFactory.getCurrentSession().createQuery("from Commande where client_idClient = " + idClient).getResultList();
		if(cmde.isEmpty()) {
			sessionFactory.getCurrentSession().createQuery("delete Client where idClient = " + idClient).executeUpdate();
			return true;
		} else{
			return false;
		}
	}

	@Override
	public Client getClient(int idClient) {
		return sessionFactory.getCurrentSession().get(Client.class, idClient);
	}

	@Override
	public ArrayList<Client> getAllClient() {
		return (ArrayList<Client>) sessionFactory.getCurrentSession().createQuery("from Client").getResultList();
	}
}
