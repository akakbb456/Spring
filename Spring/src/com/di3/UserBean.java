package com.di3;

public class UserBean {
	private UserService userService;
	
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	public void print() {
		System.out.println(userService.msg());
	}
}
