package com.luna.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClientTest2 {
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
	}
}
