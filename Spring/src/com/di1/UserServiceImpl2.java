package com.di1;

public class UserServiceImpl2 implements UserService{
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		this.name="������";
		this.tel="010-1111-1111";
		this.age=20;
	}
	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		String s = "�̸�:"+name+":"+",��ȭ:"+tel+":"+",����:"+age;
		return s;
	}
	
}
