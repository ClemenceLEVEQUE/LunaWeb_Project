package com.luna.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.Article;
import com.luna.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace("/")
@Result(name="success", location="/test.jsp" )
public class TestAction extends ActionSupport implements ModelDriven<Article> {
	private static final long serialVersionUID = 1L;

	private Article article=new Article();
	@Autowired
	private ArticleService articleService;

	@Override
	@Action("roland")
	public String execute() {
		//return articleService.add(article);
		System.out.println("kjdfhjdhfqdjghjdsghdSJHGjsdghjldghl");
		return SUCCESS;
		
		
	}

	@Override
	public Article getModel() {
		return article;
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
}
