package com.sunil.jsrshoe.user.dao;

import com.sunil.jsrshoe.user.model.User;

public interface UserDAO {
	public User logInUser(String username, String password);
	public boolean registerUser(User user);
}
