package com.luna.dao;

import java.util.ArrayList;
import com.luna.entities.User;

public interface UserDAO {
	public boolean insertUser(User user);
	public void updateUser(User user);
	public void removeUser(int idUser);
	public User getUser(User user);
	public ArrayList<User> getAllUser();
}
