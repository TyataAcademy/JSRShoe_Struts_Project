package com.sunil.jsrshoe.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sunil.jsrshoe.dbConfig.DBConnect;
import com.sunil.jsrshoe.user.model.User;

public class UserDAOImpl implements UserDAO {
	private static Connection conn;
	private User userx;

	@Override
	public User logInUser(String username, String password) {
		try {
			System.out.println("["+username+" "+password+"]");
			conn = DBConnect.getDbConnection();
			String sql = "SELECT user_id,user_name,user_password,first_name,last_name,email from tbl_user WHERE user_name = ? AND user_password = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);

			ResultSet rsObj = pstmt.executeQuery();
			
			if(rsObj==null)
				System.out.println("rsObj is null.");
			while(rsObj.next()){
				userx = new User();
				int user_id = rsObj.getInt(1);				 
				String user_name = rsObj.getString(2);
				String user_password = rsObj.getString(3);
				String first_name = rsObj.getString(4);
				String last_name = rsObj.getString(5);
				String email = rsObj.getString(6);
				
				userx.setUserid(user_id);				
				userx.setUsername(user_name);				
				userx.setPassword(user_password);				
				userx.setFname(first_name);				
				userx.setLname(last_name);				
				userx.setEmail(email);								
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userx;
	}

	@Override
	public boolean registerUser(User user) {
		int x = 0; 
		try {
			conn = DBConnect.getDbConnection();
			String rsql = "insert into  tbl_user(user_name,user_password,first_name,last_name,email) values (?, ?, ? , ?, ?)";
			PreparedStatement pst = conn.prepareStatement(rsql);
			pst.setString(1,user.getUsername());
			pst.setString(2,user.getPassword());
			pst.setString(3,user.getFname());
			pst.setString(4,user.getLname());
			pst.setString(5,user.getEmail());
			
			x = pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(x==0)
			return false;
		else
			return true;
	}

}
