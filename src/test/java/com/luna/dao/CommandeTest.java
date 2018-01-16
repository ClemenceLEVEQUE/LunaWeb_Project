package com.luna.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Commande;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class CommandeTest {
	@Autowired
	private CommandeDAO commandeDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void BeforeTest() {
		Commande cde1 = new Commande();
		Commande cde2 = new Commande();
		Commande cde3 = new Commande();
		sessionFactory.getCurrentSession().save(cde1);
		sessionFactory.getCurrentSession().save(cde2);
		sessionFactory.getCurrentSession().save(cde3);
	}
	
	@Test
	@Transactional
	public void doesItInsert() {
		Commande user = new Commande();
		commandeDAO.insertCommande(user);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Commande user = new Commande();
		commandeDAO.updateCommande(user);
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
		commandeDAO.getCommande(1);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		commandeDAO.getAllCommande();
	}
}
