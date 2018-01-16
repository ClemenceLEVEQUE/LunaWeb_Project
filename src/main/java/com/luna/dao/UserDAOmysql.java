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
	public User getUser(int idUser) {
		return sessionFactory.getCurrentSession().get(User.class, idUser);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<User> getAllUser() {
		return (ArrayList<User>) sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}
}
