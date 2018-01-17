package com.luna.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest2 {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		
	}
}
