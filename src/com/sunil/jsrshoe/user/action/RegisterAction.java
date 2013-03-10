package com.sunil.jsrshoe.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sunil.jsrshoe.user.bo.UserBO;
import com.sunil.jsrshoe.user.bo.UserBOFactory;
import com.sunil.jsrshoe.user.model.User;

public class RegisterAction extends ActionSupport{
	private User userBean;
	
	public void validate(){
		if(this.userBean.getFname().length() == 0){
			addFieldError( "userBean.fname", "First name is required." );
		}
		
		if(this.userBean.getLname().length() == 0){
			addFieldError( "userBean.lname", "Last name is required." );
		}
		
		if(this.userBean.getUsername().length() == 0){
			addFieldError( "userBean.username", "User name is required." );
		}
		
		if(this.userBean.getPassword().length() == 0){
			addFieldError( "userBean.password", "Password is required." );
		}
		
		if(this.userBean.getEmail().length() == 0){
			addFieldError( "userBean.email", "Email name is required." );
		}
	}
	
	public String execute() throws Exception{
		User userx = new User();
		userx.setUsername(userBean.getUsername());
		userx.setPassword(userBean.getPassword());
		userx.setFname(userBean.getFname());
		userx.setLname(userBean.getLname());
		userx.setEmail(userBean.getEmail());

		UserBO ubo2 = UserBOFactory.getInstanceUserBO();
		if(ubo2.registerUser(userx)){
			return "success";			
		}
		else{
			return "error";
		}
	}
		
	public User getUserBean() {
		return userBean;
	}

	public void setUserBean(User userBean) {
		this.userBean = userBean;
	}
	
}
