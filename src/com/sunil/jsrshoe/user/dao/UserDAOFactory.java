package com.sunil.jsrshoe.user.dao;

public class UserDAOFactory {
	public static UserDAO getInstanceUserDAO(){
		return new UserDAOImpl();
	}	
}
