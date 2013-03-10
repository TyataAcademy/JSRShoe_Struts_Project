package com.sunil.jsrshoe.user.bo;

import com.sunil.jsrshoe.user.dao.UserDAO;
import com.sunil.jsrshoe.user.dao.UserDAOFactory;
import com.sunil.jsrshoe.user.model.User;

public class UserBOImpl implements UserBO{
	
	@Override
	public User logInUser(String username, String password) {
		UserDAO udoObj = UserDAOFactory.getInstanceUserDAO();
		return udoObj.logInUser(username, password);
	}

	@Override
	public Boolean registerUser(User user) {
		UserDAO udoObj2 = UserDAOFactory.getInstanceUserDAO();
		return udoObj2.registerUser(user);
	}
	
	
}
