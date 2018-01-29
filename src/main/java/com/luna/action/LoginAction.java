package com.luna.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Results(value = { @Result(name = "SUCCESS", location = "/WEB-INF/jsp/menu.jsp"),
		@Result(name = "ERROR", location = "/WEB-INF/jsp/login.jsp"),
		@Result(name = "notlogged", type = "redirectAction", location = "index") })
public class LoginAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;

	private User user;
	@Autowired
	private UserService userService;

	@Action("login")
	@Override
	public String execute() throws Exception {
		User userServ = userService.get(user);
		if (userServ != null) {
			ServletActionContext.getRequest().getSession().setAttribute("username", user.getLogin());
			ServletActionContext.getRequest().getSession().setAttribute("pwd", user.getMdp());
			return "SUCCESS";
		} else
			return "ERROR";
	}

	@Action("deconnexion")
	public String logout() throws Exception {
		ServletActionContext.getRequest().getSession().setAttribute("username", null);
		ServletActionContext.getRequest().getSession().setAttribute("pwd", null);
		return "notlogged";
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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
