package com.sunil.jsrshoe.user.bo;

import com.sunil.jsrshoe.user.model.User;

public interface UserBO {
	public User logInUser(String username, String password);
	public Boolean registerUser(User user);
}
