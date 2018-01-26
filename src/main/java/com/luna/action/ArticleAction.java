package com.luna.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;

import com.luna.service.ArticleService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results({ @Result(name = "SUCCESS", location = "/jsp/listeArticle.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "AffichageArticle.action"),
		@Result(name = "insertArt", location = "/jsp/ajoutArticle.jsp"),
		@Result(name = "errorAdd", location = "/jsp/ajoutArticle.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "AffichageArticle.action"),
		@Result(name = "errorDelete", type = "redirectAction", location = "AffichageArticle.action"),
		@Result(name = "updateArticle", location = "/jsp/modifArticle.jsp"),
		@Result(name = "update", type = "redirectAction", location = "AffichageArticle.action") })
public class ArticleAction extends ActionSupport implements ModelDriven<Article> {
	private static final long serialVersionUID = 1L;

	private Article article;
	@Autowired
	private ArticleService articleService;
	private List<Article> models;

	@Action("AffichageArticle")
	@Override
	public String execute() throws Exception {
		setModels();
		return "SUCCESS";
	}

	@Action("insertArt")
	public String insertArticle() throws Exception {
		return articleService.add(article);
	}

	@Action("insertThisArt")
	public String insert() throws Exception {
		return "insertArt";
	}

	@Action("deleteArt")
	public String deleteArticle() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		return articleService.delete(id);
	}

	@Action("updateArt")
	public String updateArticle() throws Exception {
		return articleService.update(article);
	}

	@Action("updateThisArt")
	public String update() throws Exception {
		int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
		article = articleService.get(id);
		return "updateArticle";
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

	public void setModels() {
		this.models = articleService.listArticle();
	}

	@Override
	public Article getModel() {
		return article;
	}

}
