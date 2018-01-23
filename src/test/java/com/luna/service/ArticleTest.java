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


// Id 1, 2, 3 et 16
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class ArticleTest {
	@Autowired
	private ArticleService articleService;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Test
	@Transactional
	public void doesItInsert() {
		Article Art = new Article("4","4","4",4,4);
		articleService.add(Art);
		Article article = sessionFactory.getCurrentSession().get(Article.class, 16);
		assertNotNull(article);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		Article article = sessionFactory.getCurrentSession().get(Article.class, 16);
		Article Art = new Article("5","5","5",5,5);
		Art.setIdArticle(16);
		articleService.update(Art);
		Article article2 = sessionFactory.getCurrentSession().get(Article.class, 16);
		assertNotEquals(article2, article);
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
		Article article = articleService.get(1);
		assertNotNull(article);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		List<Article> articles = articleService.listArticle();
		assertNotNull(articles);
	}
}
