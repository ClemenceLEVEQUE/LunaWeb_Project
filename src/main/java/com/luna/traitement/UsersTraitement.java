package com.luna.traitement;

import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;

public class UsersTraitement {
	@Autowired
	private UserService userService;
	private User user;
	
	public String Authentification() {
		User userTraitement = userService.get(user);
		if (userTraitement != null) return "SUCCESS";
		else return "ERROR";
	}
	
	public String Inscription() {
		if (userService.add(user)) {
			return "SUCCESS";
		} else{
			return "ERROR";
		}
	}
	
	public String Modification() {
		userService.update(user);
		return "SUCCESS";
	}
}
