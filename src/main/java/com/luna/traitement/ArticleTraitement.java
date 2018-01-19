package com.luna.traitement;

import org.springframework.beans.factory.annotation.Autowired;

import com.luna.service.ArticleService;
import com.luna.entities.Article;

public class ArticleTraitement {
	@Autowired
	ArticleService articleService;
	
	public String ModifierArticle(Article article) {
		articleService.update(article);
		return "SUCCESS";
	}
	
	public String AjouterArticle(Article article) {
		if(articleService.add(article)) {
			return "SUCCESS";
		} else return "ERROR";
	}
//	@Autowired
//	ArticleDAO dao;
//
//	public void AfficherArticle(JTextField code, JTextField designation, JTextField prix, JTextField categ, JSlider qte,
//			JTextField id, int idArticle) {
//		Article art = new Article();
//		art = dao.getArticle(idArticle);
//		code.setText(art.getCodeArt());
//		designation.setText(art.getNomArticle());
//		categ.setText(art.getCategorie());
//		prix.setText("" + art.getPrixUnitaire());
//		qte.setValue(art.getStock());
//		id.setText("" + art.getIdArticle());
//	}
//
//	public void Effacer(JTextField code, JTextField designation, JTextField prix, JTextField categ, JSlider qte,
//			JTextField id) {
//		code.setText("");
//		designation.setText("");
//		prix.setText("");
//		categ.setText("");
//		qte.setValue(0);
//		id.setText("");
//	}
//
//	public void Supprimer(JTextField code, JTextField designation, JTextField prix, JTextField categ, JSlider qte,
//			JTextField id, int idArticle) {
//		if(dao.removeArticle(idArticle)) {
//			code.setText("");
//			designation.setText("");
//			prix.setText("");
//			categ.setText("");
//			qte.setValue(0);
//			id.setText("");
//		} else {
//			JOptionPane.showMessageDialog(code, "L'article est utilis� dans une commande.", "Suppression impossible",
//					JOptionPane.ERROR_MESSAGE);
//		}
//	}
//
//
//
//	public boolean VerifPrix(JTextField prix) {
//		try {
//			float f = Float.parseFloat(prix.getText());
//			return true;
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(prix, "Le prix doit �tre au format \"999.99\"", "Ajout impossible",
//					JOptionPane.ERROR_MESSAGE);
//			return false;
//		}
//	}
}
