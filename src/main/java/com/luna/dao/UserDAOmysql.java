package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luna.entities.Client;
import com.luna.entities.User;

@Repository
public class UserDAOmysql implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public void removeUser(int idUser) {
		// TODO 
	}

	@Override
	public User getUser(String login, String password) {
		return (User) sessionFactory.getCurrentSession().createQuery("from User where login = '" + login + "' and mdp = '" + password + "'").getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<User> getAllUser() {
		return (ArrayList<User>) sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}
}
