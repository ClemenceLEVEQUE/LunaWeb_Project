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

@Results({ @Result(name = "SUCCESS", location = "/WEB-INF/jsp/listeArticle.jsp"),
		@Result(name = "insert", type = "redirectAction", location = "AffichageArticle"),
		@Result(name = "insertArt", location = "/WEB-INF/jsp/ajoutArticle.jsp"),
		@Result(name = "errorAdd", location = "/WEB-INF/jsp/ajoutArticle.jsp"),
		@Result(name = "delete", type = "redirectAction", location = "AffichageArticle"),
		@Result(name = "errorDelete", type = "redirectAction", location = "AffichageArticle"),
		@Result(name = "updateArticle", location = "/WEB-INF/jsp/modifArticle.jsp"),
		@Result(name = "update", type = "redirectAction", location = "AffichageArticle"),
		@Result(name = "research", location = "/WEB-INF/jsp/listeArticle.jsp"),
		@Result(name = "notlogged", type = "redirectAction", location = "index") })
public class ArticleAction extends ActionSupport implements ModelDriven<Article> {
	private static final long serialVersionUID = 1L;

	private Article article;
	@Autowired
	private ArticleService articleService;
	private List<Article> models;

	@Action("AffichageArticle")
	@Override
	public String execute() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			setModels();
			return "SUCCESS";
		}
	}

	@Action("insertArt")
	public String insertArticle() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			return articleService.add(article);
		}
	}

	@Action("insertThisArt")
	public String insert() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			return "insertArt";
		}
	}

	@Action("deleteArt")
	public String deleteArticle() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			return articleService.delete(id);
		}
	}

	@Action("updateArt")
	public String updateArticle() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			return articleService.update(article);
		}
	}

	@Action("updateThisArt")
	public String update() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			int id = Integer.parseInt(ServletActionContext.getRequest().getParameter("id"));
			article = articleService.get(id);
			return "updateArticle";
		}
	}

	@Action("searchArt")
	public String search() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if(user == null) {
			return "notlogged";
		} else {
			String search = ServletActionContext.getRequest().getParameter("Search");
			setModels(articleService.search(search));
			return "research";
		}
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

	public void setModels(List<Article> articles) {
		this.models = articles;
	}

	@Override
	public Article getModel() {
		return article;
	}
}
