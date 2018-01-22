package com.luna.traitement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luna.entities.User;
import com.luna.service.UserService;
@Service
public class UsersTraitement {
	@Autowired
	private UserService userService;

	public String Authentification(User user) {
		User userTraitement = userService.get(user);
		if (userTraitement != null) return "SUCCESS";
		else return "ERROR";
	}
	
	public String Inscription(User user) {
		if (userService.add(user)) {
			return "SUCCESS";
		} else{
			return "ERROR";
		}
	}
	
	public String Modification(User user) {
		userService.update(user);
		return "SUCCESS";
	}
}
