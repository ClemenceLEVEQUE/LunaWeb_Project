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
import com.luna.entities.Commande;
import com.luna.entities.LigneCommande;


// Id 10, 11, 12 et 19
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class LigneCommandeTest {
	@Autowired
	private LigneCommandeService ligneCommandeService;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	@Transactional
	public void doesItInsert() {
		LigneCommande lig = new LigneCommande(new Commande(), new Article(), 19);
		ligneCommandeService.add(lig);
		LigneCommande ligne = sessionFactory.getCurrentSession().get(LigneCommande.class, 19);
		assertNotNull(ligne);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		LigneCommande ligne = sessionFactory.getCurrentSession().get(LigneCommande.class, 19);
		LigneCommande lig = new LigneCommande(new Commande(), new Article(), 17);
		lig.setIdLigne(19);
		ligneCommandeService.update(lig);
		LigneCommande ligne2 = sessionFactory.getCurrentSession().get(LigneCommande.class, 19);
		assertNotEquals(ligne2, ligne);
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
		LigneCommande lig = ligneCommandeService.get(10);
		assertNotNull(lig);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		List<LigneCommande> lig = ligneCommandeService.listLigneCommande(9);
		assertNotNull(lig);
	}
}
