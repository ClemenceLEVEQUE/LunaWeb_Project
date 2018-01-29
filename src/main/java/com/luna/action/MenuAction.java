package com.luna.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Action("accueil")
@Results(value = { @Result(name = "success", location = "/WEB-INF/jsp/menu.jsp"),
		@Result(name = "notlogged", type = "redirectAction", location = "index") })
public class MenuAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		String user = (String) ServletActionContext.getRequest().getSession().getAttribute("username");
		if (user == null) {
			return "notlogged";
		} else {
			return "success";
		}
	}
}
