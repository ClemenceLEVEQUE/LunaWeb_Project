package com.luna.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("index")
@Result( location = "/WEB-INF/jsp/login.jsp")
public class HomePageAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
}
