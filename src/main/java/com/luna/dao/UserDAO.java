package com.luna.dao;

import java.util.ArrayList;
import com.luna.entities.User;

public interface UserDAO {
	public void insertUser(User user);
	public void updateUser(User user);
	public void removeUser(int idUser);
	public User getUser(int idUser);
	public ArrayList<User> getAllUser();
}