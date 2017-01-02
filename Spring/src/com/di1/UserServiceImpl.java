package com.di1;

public class UserServiceImpl implements UserService{
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name="½ºÇÁ¸µ";
		this.tel="010-1111-1111";
		this.age=20;
	}
	
	
	public UserServiceImpl(String name, String tel, int age) {
		this.name=name;
		this.tel=tel;
		this.age=age;
	}
	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		String s = name+":"+tel+":"+age;
		return s;
	}
}
