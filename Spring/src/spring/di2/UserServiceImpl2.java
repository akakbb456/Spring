package spring.di2;

import org.springframework.beans.factory.annotation.Required;

public class UserServiceImpl2 implements UserService{
	private String name;
	private String tel;
	private int age;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}

	@Required
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String msg() {
		// TODO Auto-generated method stub
		return "이름:"+name+":"+",전화:"+tel+":"+",나이:"+age;
	}

}
