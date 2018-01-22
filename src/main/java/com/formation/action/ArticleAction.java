package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;
import com.luna.entities.Commande;
import com.luna.traitement.ArticleTraitement;
import com.luna.traitement.ClientTraitement;
import com.luna.traitement.CommandeTraitement;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Action("/ajoutModifArticle")

@Results({ @Result(name = "success", location = "ajoutModifArticle.jsp")})
public class ArticleAction extends ActionSupport implements ModelDriven<Article>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Article article;
	@Autowired
	private ArticleTraitement articleTraitement;

	
	

	@Override
	public String execute() throws Exception {
		article = ArticleTraitement.AfficherArticle();
		return SUCCESS;
	}
	
	
	
	
	public Article getArticle() {
		return article;
	}





	public void setArticle(Article article) {
		this.article = article;
	}





	public ArticleTraitement getArticleTraitement() {
		return articleTraitement;
	}





	public void setArticleTraitement(ArticleTraitement articleTraitement) {
		this.articleTraitement = articleTraitement;
	}





	@Override
	public Article getModel() {
		return null;
	}

}
