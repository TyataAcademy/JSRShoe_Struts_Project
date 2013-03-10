package com.sunil.jsrshoe.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sunil.jsrshoe.user.bo.UserBO;
import com.sunil.jsrshoe.user.bo.UserBOFactory;
import com.sunil.jsrshoe.user.model.User;

public class LoginAction extends ActionSupport{
	private User userBean;

	public void validate(){
		if(this.userBean.getUsername().length() == 0){
			addFieldError( "userBean.username", "Username name is required." );
		}
		
		if(this.userBean.getPassword().length() == 0){
			addFieldError("userBean.password","Password is required.");
		}
	}
	
	public String execute() throws Exception{
		UserBO ubo = UserBOFactory.getInstanceUserBO();
		userBean = ubo.logInUser(userBean.getUsername(),userBean.getPassword());
		if(userBean == null){
			addFieldError("userBean.email","Invalid User.");
			return "error";
		}else{
			return "success";			
		}
	}
	
	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}
	
}
