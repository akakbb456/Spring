package spring.di3.user1;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component // ��ü�� �����ȴ�.
public class UserServiceImpl1 implements UserService{
	private String name;
	private String tel;
	private int age;
	
	
	public UserServiceImpl1() {
		name = "�ڹ�";
		tel = "010";
		age = 10;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String msg() {
		// TODO Auto-generated method stub
		return name+":"+tel+":"+age;
	}

}
