package com.luna.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Action("/inscription")
@Results(value= {@Result (name="SUCCESS", location ="/login.jsp"), @Result(name="ERROR", location="/inscription.jsp")})



public class InscriptionAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	@Autowired
	private UserService userService;
	
	
	private static final long serialVersionUID = 1L;

	public String inscription() throws Exception {
		return UserService.add(user);	}

	
	
	
	
	public User getUser() {
		return user;
	}





	public void setUser(User user) {
		this.user = user;
	}





	public UserService getUserService() {
		return userService;
	}





	public void setUserService(UserService userService) {
		this.userService = userService;
	}





	@Override
	public User getModel() {
		
		return User;
	}


	
	
	
	
}
