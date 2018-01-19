package com.formation.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;
import com.luna.traitement.UsersTraitement;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Action("login")
@Results(value= {@Result(name="SUCCESS", location="/index.jsp"),@Result(name="ERROR", location="/login.jsp")})
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	@Autowired
	private UsersTraitement usersTraitement;
	
	
	@Override
	public String execute() throws Exception {
		return usersTraitement.Authentification(user);
	}


	@Override
	public User getModel() {
		return user;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UsersTraitement getUsersTraitement() {
		return usersTraitement;
	}


	public void setUsersTraitement(UsersTraitement usersTraitement) {
		this.usersTraitement = usersTraitement;
	}




	

}
