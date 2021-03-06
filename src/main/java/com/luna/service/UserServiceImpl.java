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
	public String add(User user) {
		if(userDao.insertUser(user)) {
			return "SUCCESS";
		} else return "ERROR";
	}
	@Override
	public String update(User user) {
		userDao.updateUser(user);
		return "update";
	}

	@Override
	public String delete(int idUser) {
		userDao.removeUser(idUser);
		return null;
	}

	@Override
	public User get(User user) {
		return userDao.getUser(user);
	}

	@Override
	public List<User> listUser() {
		return userDao.getAllUser();
	}

}
