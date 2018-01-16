package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Article;

@Repository
public class ArticleDAOmysql implements ArticleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertArticle(Article article) {
		sessionFactory.getCurrentSession().save(article);
	}

	@Override
	public void updateArticle(Article article) {
		sessionFactory.getCurrentSession().update(article);
	}

	@Override
	public void removeArticle(int idArticle) {
		// TODO
	}

	@Override
	public Article getArticle(int idArticle) {
		return sessionFactory.getCurrentSession().get(Article.class, idArticle);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Article> getAllArticle() {
		return (ArrayList<Article>) sessionFactory.getCurrentSession().createQuery("from Article").getResultList();
	}
}
