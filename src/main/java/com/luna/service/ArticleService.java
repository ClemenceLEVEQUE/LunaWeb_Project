package com.luna.service;

import java.util.List;

import com.luna.entities.Article;

public interface ArticleService {
	String add(Article Art);
	String update(Article Art);
	String delete(int idArticle);
	Article get(int idArticle);
	List<Article> listArticle();
	List<Article> search(String search);
}
