package com.luna.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luna.entities.Article;

public class ArticleTest2 {
	@Autowired
	private static ArticleDAO articleDao;
	
	public static void main(String[] args) {
		Article art1 = new Article("1","1","1",1,1);
		Article art2 = new Article("2","2","2",2,2);
		Article art3 = new Article("3","3","3",3,3);
		Article art = null;
		List<Article> arts = null;
		
		articleDao.insertArticle(art1);
		articleDao.insertArticle(art2);
		articleDao.insertArticle(art3);
		
		art = articleDao.getArticle(1);
		System.out.println(art.getIdArticle());
		System.out.println(art.getCodeArt());
		System.out.println(art.getCategorie());
		System.out.println(art.getPrixUnitaire());
		System.out.println(art.getNomArticle());
		System.out.println(art.getStock());
		
		arts = articleDao.getAllArticle();
		for(Article arti:arts) {
			System.out.println(arti.getIdArticle());
			System.out.println(arti.getCodeArt());
			System.out.println(arti.getCategorie());
			System.out.println(arti.getPrixUnitaire());
			System.out.println(arti.getNomArticle());
			System.out.println(arti.getStock());
		}
		
		art3.setCategorie("4");
		art3.setCodeArt("3");
		articleDao.updateArticle(art3);
		art = articleDao.getArticle(3);
		System.out.println(art.getIdArticle());
		System.out.println(art.getCodeArt());
		System.out.println(art.getCategorie());
		System.out.println(art.getPrixUnitaire());
		System.out.println(art.getNomArticle());
		System.out.println(art.getStock());
	}
}
