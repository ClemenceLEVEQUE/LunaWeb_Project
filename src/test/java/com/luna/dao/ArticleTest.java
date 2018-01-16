package com.luna.dao;

import javax.transaction.Transactional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Article;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class ArticleTest {
	@Autowired
	private ArticleDAO articleDao;
	
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
		articleDao.insertArticle(Art);
	}

	@Test
	@Transactional
	@Ignore
	public void doesItRemove() {
		Article Art = new Article();
		articleDao.insertArticle(Art);
	}

	@Test
	@Transactional
	public void doesItGet() {
		Article Art = new Article();
		articleDao.insertArticle(Art);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		Article Art = new Article();
		articleDao.insertArticle(Art);
	}
}
