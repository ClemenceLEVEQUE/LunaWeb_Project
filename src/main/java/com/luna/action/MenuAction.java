package com.luna.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("accueil")
@Result( location = "/jsp/menu.jsp")
public class MenuAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
}
