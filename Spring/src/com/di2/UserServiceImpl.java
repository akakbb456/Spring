package com.di2;

public class UserServiceImpl implements UserService {
	private String name, tel;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String message() {
		// TODO Auto-generated method stub
		return name+":"+tel+":"+age;
	}
}
