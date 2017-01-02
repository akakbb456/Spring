package com.di1;

public class UserServiceImpl2 implements UserService{
	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		this.name="스프링";
		this.tel="010-1111-1111";
		this.age=20;
	}
	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		String s = "이름:"+name+":"+",전화:"+tel+":"+",나이:"+age;
		return s;
	}
	
}
