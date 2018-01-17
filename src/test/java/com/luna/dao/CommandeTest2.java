package com.luna.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandeTest2 {
	@Autowired
	private CommandeDAO commandeDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
	}
}
