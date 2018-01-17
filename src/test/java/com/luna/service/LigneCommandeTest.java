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
import com.luna.entities.LigneCommande;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class LigneCommandeTest {
	@Autowired
	private LigneCommandeDAO ligneCommandeDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void BeforeTest() {
		LigneCommande cde1 = new LigneCommande();
		LigneCommande cde2 = new LigneCommande();
		LigneCommande cde3 = new LigneCommande();
		sessionFactory.getCurrentSession().save(cde1);
		sessionFactory.getCurrentSession().save(cde2);
		sessionFactory.getCurrentSession().save(cde3);
	}
	
	@Test
	@Transactional
	public void doesItInsert() {
		LigneCommande user = new LigneCommande();
		ligneCommandeDAO.insertLigneCommande(user);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		LigneCommande user = new LigneCommande();
		ligneCommandeDAO.updateLigneCommande(user);
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
		ligneCommandeDAO.getLigneCommande(1);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		ligneCommandeDAO.getAllLignePourCommande(1);
	}
}
