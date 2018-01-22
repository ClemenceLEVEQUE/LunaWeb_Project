package com.luna.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;

import com.luna.service.ArticleService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@Action("/ajoutModifArticle")

@Results({ @Result(name = "success", location = "ajoutModifArticle.jsp"),
@Result(name= "listArt" , location = "ajoutModifArticle.jsp"),


})
public class ArticleAction extends ActionSupport implements ModelDriven<Article>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Article article;
	@Autowired
	private ArticleService articleService;
    private List<Article> AllArticle;
	
	
@Action("AffichageArticle")
	@Override
	public String execute() throws Exception {
		AllArticle= articleService.listArticle();
		return "success";
	}
	
	
	
	
	public Article getArticle() {
		return article;
	}





	public void setArticle(Article article) {
		this.article = article;
	}









	public ArticleService getArticleService() {
		return articleService;
	}




	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}




	public List<Article> getAllArticle() {
		return AllArticle;
	}




	public void setAllArticle(List<Article> allArticle) {
		AllArticle = allArticle;
	}




	@Override
	public Article getModel() {
		return article;
	}

}
