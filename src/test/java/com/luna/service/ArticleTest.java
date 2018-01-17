package com.luna.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Article;

public class ArticleTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConteneurSpring.class);

		ArticleService service = context.getBean(ArticleService.class);

		Article art1 = new Article("1", "1", "1", 1, 1);
		Article art2 = new Article("2", "2", "2", 2, 2);
		Article art3 = new Article("3", "3", "3", 3, 3);
		Article art = null;
		List<Article> arts = null;

		service.add(art1);
		service.add(art2);
		service.add(art3);

		art = service.get(1);
		System.out.println(art.getIdArticle());
		System.out.println(art.getCodeArt());
		System.out.println(art.getCategorie());
		System.out.println(art.getPrixUnitaire());
		System.out.println(art.getNomArticle());
		System.out.println(art.getStock());

		arts = service.listArticle();
		for (Article arti : arts) {
			System.out.println(arti.getIdArticle());
			System.out.println(arti.getCodeArt());
			System.out.println(arti.getCategorie());
			System.out.println(arti.getPrixUnitaire());
			System.out.println(arti.getNomArticle());
			System.out.println(arti.getStock());
		}

		art3.setCategorie("4");
		art3.setCodeArt("3");
		service.update(art3);
		art = service.get(3);
		System.out.println(art.getIdArticle());
		System.out.println(art.getCodeArt());
		System.out.println(art.getCategorie());
		System.out.println(art.getPrixUnitaire());
		System.out.println(art.getNomArticle());
		System.out.println(art.getStock());
		
		context.close();
	}
}
