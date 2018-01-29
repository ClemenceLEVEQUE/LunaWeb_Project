package com.luna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luna.dao.ArticleDAO;
import com.luna.entities.Article;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDAO articleDao;

	@Override
	public String add(Article Art) {
		if (articleDao.insertArticle(Art)) {
			return "insert";
		} else
			return "errorAdd";
	}

	@Override
	public String update(Article Art) {
		articleDao.updateArticle(Art);
		return "update";

	}

	@Override
	public String delete(int idArticle) {
		if (articleDao.removeArticle(idArticle)) {
			return "delete";
		} else
			return "errorDelete";
	}

	@Override
	public Article get(int idArticle) {
		return articleDao.getArticle(idArticle);
	}

	@Override
	public List<Article> listArticle() {
		return articleDao.getAllArticle();
	}

	@Override
	public List<Article> search(String search) {
		return articleDao.getSearch(search);
	}
}