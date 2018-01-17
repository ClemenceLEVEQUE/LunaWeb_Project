package com.luna.service;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luna.conteneur.ConteneurSpring;
import com.luna.entities.User;
import com.opensymphony.xwork2.interceptor.annotations.Before;

// TODO avec Arquillian
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class UserTest {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Before
	public void BeforeTest() {
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		sessionFactory.getCurrentSession().save(user1);
		sessionFactory.getCurrentSession().save(user2);
		sessionFactory.getCurrentSession().save(user3);
	}
	
	@Test
	@Transactional
	public void doesItInsert() {
		User user = new User();
		userDAO.insertUser(user);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		User user = new User();
		userDAO.updateUser(user);
	}

	@Test
	@Transactional
	@Ignore
	public void doesItRemove() {
		// TODO
	}

	@Test
	@Transactional
	public void doesItGet() {
		userDAO.getUser(1);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		userDAO.getAllUser();
	}
}
