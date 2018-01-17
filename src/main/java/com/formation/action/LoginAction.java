package com.formation.action;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.luna.entities.User;
import com.luna.service.UserService;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Action("/login")
@Results({ @Result(name="success", location= "/index.jsp"), @Result(name="error", location="/login.jsp")})
public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = 1L;
	
	private User user;
	
	@Autowired
	public UserService userService;
	

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

	@Action("index") 
public String accueil() {
	return SUCCESS;
}
	
	public String execute() throws Exception{
		List<User> users =userService.getAllUser();
	
	}
	
	@Override
	public User getModel() {
		
		return user;
	}
	

}
