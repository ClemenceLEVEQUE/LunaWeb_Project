package com.luna.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Article;
import com.luna.entities.LigneCommande;

@Repository
@SuppressWarnings("unchecked")
public class ArticleDAOmysql implements ArticleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean insertArticle(Article article) {
		List<Article> art = sessionFactory.getCurrentSession().createQuery("from Article where codeArt = '" + article.getCodeArt() + "'").getResultList();
		if(art.isEmpty()) {
			sessionFactory.getCurrentSession().save(article);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateArticle(Article article) {
		sessionFactory.getCurrentSession().update(article);
	}

	@Override
	public boolean removeArticle(int idArticle) {
		List<LigneCommande> ligne = sessionFactory.getCurrentSession().createQuery("from LigneCommande where article_idArticle = " + idArticle).getResultList();
		if(ligne.isEmpty()) {
			sessionFactory.getCurrentSession().createQuery("delete Article where idArticle = " + idArticle).executeUpdate();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Article getArticle(int idArticle) {
		return sessionFactory.getCurrentSession().get(Article.class, idArticle);
	}

	public ArrayList<Article> getAllArticle() {
		return (ArrayList<Article>) sessionFactory.getCurrentSession().createQuery("from Article").getResultList();
	}
}
