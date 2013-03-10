<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login</title>
<s:head />
</head>
<body>
<img src="newtitle.png" width="980" height="140" border="0"/>
<h3>Log In</h3>
	<s:form action="login">
	 	  <s:textfield name="userBean.username" label="User Name" />
	 	  <s:password  name="userBean.password" label="Password" /> 	  
	   	  <s:submit value="Log In" />   	 	  
	</s:form>	
	<br />
	<input type="button" value="Register" onClick="javascript:location.href = 'RegisterUser.jsp';" />  	   
</body>
</html>