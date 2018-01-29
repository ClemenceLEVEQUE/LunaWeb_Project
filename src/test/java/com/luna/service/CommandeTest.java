package com.luna.service;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
import com.luna.entities.Client;
import com.luna.entities.Commande;


// Id 7, 8, 9 et 18
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ConteneurSpring.class })
public class CommandeTest {
	@Autowired
	private CommandeService commandeService;
	@Autowired
	private SessionFactory sessionFactory;

	@Test
	@Transactional
	public void doesItInsert() {
		Commande cde = new Commande(new Client(), "12", "12", "X".charAt(0), "12", 18);
		commandeService.add(cde);
		Commande cmde = sessionFactory.getCurrentSession().get(Commande.class, 18);
		assertNotNull(cmde);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Commande cmde = sessionFactory.getCurrentSession().get(Commande.class, 18);
		Commande cde = new Commande(new Client(), "13", "13", "U".charAt(0), "13", 13);
		cde.setIdCommande(18);
		commandeService.update(cde);
		Commande cmde2 = sessionFactory.getCurrentSession().get(Commande.class, 18);
		assertNotEquals(cmde2, cmde);
	}

	@Test
	@Transactional
	public void doesItRemove() throws Exception {
		commandeService.delete(18);
		Commande cmde = sessionFactory.getCurrentSession().get(Commande.class, 18);
		assertNull(cmde);
	}

	@Test
	@Transactional
	public void doesItGet() {
		Commande cde = commandeService.get(7);
		assertNotNull(cde);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		List<Commande> commandes = commandeService.listCommande();
		assertNotNull(commandes);
	}

	@Test
	@Transactional
	public void doesItSearch() {
		List<Commande> commandes = commandeService.search("");
		assertNotNull(commandes);
	}
}
