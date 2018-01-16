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
import com.luna.entities.Article;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class ClientTest {
	@Autowired
	private ArticleDAO articleDao;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void BeforeTest() {
		Article art1 = new Article();
		Article art2 = new Article();
		Article art3 = new Article();
		sessionFactory.getCurrentSession().save(art1);
		sessionFactory.getCurrentSession().save(art2);
		sessionFactory.getCurrentSession().save(art3);
	}
	
	@Test
	@Transactional
	public void doesItInsert() {
		Article Art = new Article();
		articleDao.insertArticle(Art);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Article Art = new Article();
		articleDao.updateArticle(Art);
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
		articleDao.getArticle(1);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		articleDao.getAllArticle();
	}
}
