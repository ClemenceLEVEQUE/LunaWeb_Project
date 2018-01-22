package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Article;
import com.luna.entities.LigneCommande;

@Repository
public class ArticleDAOmysql implements ArticleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean insertArticle(Article article) {
		Article art = (Article) sessionFactory.getCurrentSession().createQuery("from Article where codeArt = '" + article.getCodeArt() + "'").getSingleResult();
		if(art != null) {
			return false;
		} else {
			sessionFactory.getCurrentSession().save(article);
			return true;
		}
	}

	@Override
	public void updateArticle(Article article) {
		sessionFactory.getCurrentSession().update(article);
	}

	@Override
	public boolean removeArticle(int idArticle) {
		LigneCommande ligne = (LigneCommande) sessionFactory.getCurrentSession().createQuery("from LigneCommande where article_idArticle = " + idArticle).getSingleResult();
		if(ligne != null) {
			return false;
		} else {
			sessionFactory.getCurrentSession().createQuery("delete Article where idArticle = " + idArticle).executeUpdate();
			return true;
		}
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
