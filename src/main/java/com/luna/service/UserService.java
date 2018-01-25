package com.luna.service;

import java.util.List;

import com.luna.entities.User;

public interface UserService {
	String add(User user);
	String update(User user);
	String delete(int idUser);
	User get(User user);
	List<User> listUser();
}
