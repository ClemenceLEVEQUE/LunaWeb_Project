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




@Results({ @Result(name = "SUCCESS", location = "listeArticle.jsp"),
@Result(name= "insert" , location = "listeArticle.jsp"),
@Result(name="errorAdd", location = "ajoutArticle.jsp"),
@Result(name="delete" , location= "listeArticle.jsp"),
@Result(name="errorDelete" , location="listeArticle.jsp"),
@Result(name="update", location="modifArticle.jsp")


})
public class ArticleAction extends ActionSupport implements ModelDriven<Article>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Article article;
	@Autowired
	private ArticleService articleService;
    private List<Article> models;

	
@Action("AffichageArticle")
	@Override
	public String execute() throws Exception {
		 setModels(articleService.listArticle());
		return SUCCESS;
	}
	
	
	@Action("insertArt")
	public String insertArticle() throws Exception{
	return articleService.add(article);
	}
	
	@Action("deleteArt")
	public String deleteArticle() throws Exception{
		return articleService.delete(article.getIdArticle());
	}
	
	@Action("updateArt")
	public String updateArticle() throws Exception{
		return articleService.update(article);
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








	public List<Article> getModels() {
		return models;
	}


	public void setModels(List<Article> models) {
		this.models = models;
	}


	@Override
	public Article getModel() {
		return article;
	}

}
