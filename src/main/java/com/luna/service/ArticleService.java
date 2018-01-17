package com.luna.service;

import java.util.List;

import com.luna.entities.Article;

public interface ArticleService {
	void add(Article Art);
	void update(Article Art);
	void delete(int idArticle);
	Article get(int idArticle);
	List<Article> listArticle();
}
