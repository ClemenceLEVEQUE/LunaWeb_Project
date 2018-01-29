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

@Results(value = { @Result(name = "SUCCESS", type = "redirectAction", location = "index"),
		@Result(name = "ERROR", location = "/WEB-INF/jsp/inscription.jsp"),
		@Result(name = "update", location = "/WEB-INF/jsp/modifUser.jsp"),
		@Result(name = "SignUp", location = "/WEB-INF/jsp/inscription.jsp"),
		@Result(name = "notlogged", type = "redirectAction", location = "index") })

public class InscriptionAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
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
	public String updateUser() throws Exception {
		String usern = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (usern == null) {
			return "notlogged";
		} else {
			return userService.update(user);
		}
	}

	@Action("updateThisUser")
	public String update() {
		String usern = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		String pwd = (String) ServletActionContext.getRequest().getSession().getAttribute("pwd");
		if (usern == null) {
			return "notlogged";
		} else {
			user = userService.get(new User(usern, pwd));
			return "updateUser";
		}
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
