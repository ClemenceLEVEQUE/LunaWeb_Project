package com.luna.maintest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.Article;
import com.luna.entities.Client;
import com.luna.entities.Commande;
import com.luna.entities.LigneCommande;
import com.luna.entities.User;
import com.luna.service.ArticleService;
import com.luna.service.ClientService;
import com.luna.service.CommandeService;
import com.luna.service.LigneCommandeService;
import com.luna.service.UserService;

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

		ClientService clientService = context.getBean(ClientService.class);
		Client cli1 = new Client();
		Client cli2 = new Client();
		Client cli3 = new Client();
		clientService.add(cli1);
		clientService.add(cli2);
		clientService.add(cli3);

		CommandeService commandeService = context.getBean(CommandeService.class);
		Commande cde1 = new Commande();
		Commande cde2 = new Commande();
		Commande cde3 = new Commande();
		commandeService.add(cde1);
		commandeService.add(cde2);
		commandeService.add(cde3);
		
		LigneCommandeService ligneCommandeService = context.getBean(LigneCommandeService.class);
		LigneCommande cdelig1 = new LigneCommande();
		cdelig1.setIdCommande(cde3);
		LigneCommande cdelig2 = new LigneCommande();
		cdelig2.setIdCommande(cde3);
		LigneCommande cdelig3 = new LigneCommande();
		cdelig3.setIdCommande(cde3);
		ligneCommandeService.add(cdelig1);
		ligneCommandeService.add(cdelig2);
		ligneCommandeService.add(cdelig3);
		
		UserService userService = context.getBean(UserService.class);
		User user1 = new User("1","1");
		User user2 = new User();
		User user3 = new User();
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
	}
}
