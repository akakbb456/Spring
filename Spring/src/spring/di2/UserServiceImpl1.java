package spring.di2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class UserServiceImpl1 implements UserService{
	private String name;
	private String tel;
	private int age;
	
	
	public UserServiceImpl1() {
		System.out.println("»ý¼ºÀÚ...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy...");
	}
	
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
		return name+":"+tel+":"+age;
	}

}
