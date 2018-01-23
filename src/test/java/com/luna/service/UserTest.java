package com.luna.service;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

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


// Id 13, 14, 15 et 20
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ConteneurSpring.class})
public class UserTest {
	@Autowired
	private UserService userService;
	@Autowired
	private SessionFactory sessionFactory;
	@Test
	@Transactional
	public void doesItInsert() {
		User user = new User("20", "20");
		userService.add(user);
		User user1 = sessionFactory.getCurrentSession().get(User.class, 20);
		assertNotNull(user1);
	}

	@Test
	@Transactional
	public void doesItUpdate() {
		User user1 = sessionFactory.getCurrentSession().get(User.class, 20);
		User user = new User("21","21");
		user.setId(20);
		userService.update(user);
		User user2 = sessionFactory.getCurrentSession().get(User.class, 20);
		assertNotEquals(user2, user1);
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
		User u = new User("20", "20");
		User user = userService.get(u);
		assertNotNull(user);
	}

	@Test
	@Transactional
	public void doesItGetAll() {
		List<User> users = userService.listUser();
		assertNotNull(users);
	}
}
