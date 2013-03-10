package com.sunil.jsrshoe.user.bo;

public class UserBOFactory {
	public static UserBO getInstanceUserBO(){
		return new UserBOImpl();
	}
}
