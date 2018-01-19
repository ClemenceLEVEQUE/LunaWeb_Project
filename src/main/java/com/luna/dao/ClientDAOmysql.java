package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Client;

@Repository
public class ClientDAOmysql implements ClientDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean insertClient(Client Cli) {
		Client client = (Client) sessionFactory.getCurrentSession().createQuery("from Client where codeClient = '" + Cli.getCodeClient() + "'");
		if(client != null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void updateClient(Client Cli) {
		sessionFactory.getCurrentSession().update(Cli);
	}

	@Override
	public void removeClient(int idClient) {
		// TODO
	}

	@Override
	public Client getClient(int idClient) {
		return sessionFactory.getCurrentSession().get(Client.class, idClient);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Client> getAllClient() {
		return (ArrayList<Client>) sessionFactory.getCurrentSession().createQuery("from Client").getResultList();
	}

}
