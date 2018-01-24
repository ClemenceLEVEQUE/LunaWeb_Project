package com.luna.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results(value = { @Result(name = "SUCCESS", location = "/login.jsp"),
		@Result(name = "ERROR", location = "/inscription.jsp"),
		@Result(name = "update", location = "/modifUser.jsp"),
		@Result(name = "SignUp", location = "/inscription.jsp") })

public class InscriptionAction extends ActionSupport implements ModelDriven<User> {

	private User user;
	@Autowired
	private UserService userService;

	@Override
	@Action("sign")
	public String execute() {
		return "SignUp";
	}

	private static final long serialVersionUID = 1L;

	@Action("inscription")
	public String inscription() throws Exception {
		return userService.add(user);
	}

	@Action("updateUser")
	public String updateArticle() throws Exception {
		return userService.update(user);
	}

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

		return user;
	}

}
