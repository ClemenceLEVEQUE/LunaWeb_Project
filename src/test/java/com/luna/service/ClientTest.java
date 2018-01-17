package com.luna.service;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Client;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class ClientTest {
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void BeforeTest() {
		Client cli1 = new Client();
		Client cli2 = new Client();
		Client cli3 = new Client();
		sessionFactory.getCurrentSession().save(cli1);
		sessionFactory.getCurrentSession().save(cli2);
		sessionFactory.getCurrentSession().save(cli3);
	}
	
	@Test
	@Transactional
	public void doesItInsert() {
		Client Cli = new Client();
		clientDAO.insertClient(Cli);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Client Cli = new Client();
		clientDAO.updateClient(Cli);
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
		clientDAO.getClient(1);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		clientDAO.getAllClient();
	}
}
