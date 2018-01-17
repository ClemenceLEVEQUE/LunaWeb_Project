package com.luna.service;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Article;
import com.luna.entities.Client;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// Id 4, 5, 6 et 17
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ConteneurSpring.class })
public class ClientTest {
	@Autowired
	private ClientService clientService;
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	public void doesItInsert() {
		Client Cli = new Client("8", "8", "8", "8", 8, "8", "8", "8", "8", "8");
		clientService.add(Cli);
		Client client = sessionFactory.getCurrentSession().get(Client.class, 17);
		assertNotNull(client);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Client client = sessionFactory.getCurrentSession().get(Client.class, 17);
		Client Cli = new Client("9", "9", "9", "9", 9, "9", "9", "9", "9", "9");
		Cli.setIdClient(17);
		clientService.update(Cli);
		Client client2 = sessionFactory.getCurrentSession().get(Client.class, 17);
		assertNotEquals(client2, client);
	}

	@Test
	@Transactional
	@Ignore
	public void doesItRemove() {
		// TODO
	}

	@Test
	@Transactional
	public void doesItGet() {
		Client client = clientService.get(4);
		assertNotNull(client);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		List<Client> clients = clientService.listClient();
		assertNotNull(clients);
	}
}
