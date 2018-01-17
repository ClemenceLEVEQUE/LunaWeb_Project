package com.luna.service;

import java.util.List;

import com.luna.entities.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(int idUser);
	void get(int idUser);
	List<User> listUser();
}
