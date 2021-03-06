package com.luna.dao;

import java.util.ArrayList;

import com.luna.entities.Article;

public interface ArticleDAO {
	public boolean insertArticle(Article Art);
	public void updateArticle(Article Art);
	public boolean removeArticle(int idArticle);
	public Article getArticle(int idArticle);
	public ArrayList<Article> getAllArticle();
	public ArrayList<Article> getSearch(String search);
}
