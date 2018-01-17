package com.luna.maintest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Article;
import com.luna.service.ArticleService;

public class AddValuesForTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConteneurSpring.class);
		ArticleService articleService = context.getBean(ArticleService.class);
		
		Article art1 = new Article();
		Article art2 = new Article();
		Article art3 = new Article();
		articleService.add(art1);
		articleService.add(art2);
		articleService.add(art3);
	}
}
