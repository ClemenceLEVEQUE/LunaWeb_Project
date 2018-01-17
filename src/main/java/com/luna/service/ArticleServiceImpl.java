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
	public void add(Article Art) {
		articleDao.insertArticle(Art);
	}

	@Override
	public void update(Article Art) {
		articleDao.updateArticle(Art);
	}

	@Override
	public void delete(int idArticle) {
		articleDao.removeArticle(idArticle);
	}

	@Override
	public Article get(int idArticle) {
		return articleDao.getArticle(idArticle);
	}

	@Override
	public List<Article> listArticle() {
		return articleDao.getAllArticle();
	}
}
