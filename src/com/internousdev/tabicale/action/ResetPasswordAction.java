package com.internousdev.tabicale.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private Map<String, Object> session;
	public String execute(){
		String result=ERROR;
		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("passwordIncorrectErrorMessageList");
		session.remove("newPasswordErrorMessageList");
		session.remove("reConfirmationNewPasswordErrorMessageList");
		session.remove("userId");
		session.remove("adminPasswordErrorMessageList");
		result=SUCCESS;
		return result;
	}
	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId=categoryId;
	}
	public Map<String, Object> getSession(){
		return session;
	}
    public void setSession(Map<String, Object>session){
    	this.session=session;
    }
}
