package com.luna.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luna.entities.User;

@Repository
@SuppressWarnings("unchecked")
public class UserDAOmysql implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insertUser(User user) {
		List<User> us = sessionFactory.getCurrentSession().createQuery("from User where login = '" + user.getLogin() + "' and mdp = '" + user.getMdp() + "'").getResultList();
		if(us.isEmpty()) {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} else {
			return false;
		}
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
	public User getUser(User user) {
		List<User> us = sessionFactory.getCurrentSession().createQuery("from User where login = '" + user.getLogin() + "' and mdp = '" + user.getMdp() + "'").getResultList();
		if(us.isEmpty()) {
			return null;
		} else {
			return us.get(0);
		}
	}

	@Override
	public ArrayList<User> getAllUser() {
		return (ArrayList<User>) sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}
}
