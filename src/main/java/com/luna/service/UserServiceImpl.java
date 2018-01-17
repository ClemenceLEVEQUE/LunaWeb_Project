package com.luna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luna.dao.UserDAO;
import com.luna.entities.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDao;

	@Override
	public void add(User user) {
		userDao.insertUser(user);
	}

	@Override
	public List<User> listUser() {
		return userDao.getAllUser();
	}

	@Override
	public void update(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void delete(int idUser) {
		userDao.removeUser(idUser);
	}

	@Override
	public void get(int idUser) {
		userDao.getUser(idUser);
	}
}
