package com.luna.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luna.entities.User;

@Repository
public class UserDAOmysql implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insertUser(User user) {
		User u = (User) sessionFactory.getCurrentSession().createQuery("from User where login = '" + user.getLogin() + "' and mdp = '" + user.getMdP() + "'").getSingleResult();
		if(u != null) {
			return false;
		} else {
			sessionFactory.getCurrentSession().save(user);
			return true;
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
		return (User) sessionFactory.getCurrentSession().createQuery("from User where login = '" + user.getLogin() + "' and mdp = '" + user.getMdP() + "'").getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<User> getAllUser() {
		return (ArrayList<User>) sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}
}
