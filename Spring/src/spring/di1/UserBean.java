package spring.di1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserBean {
	/*의존관계를 저절로 설정*/
	@Autowired
	@Qualifier("userService1")
	private UserService userService;

	
	public void execute() {
		System.out.println(userService.msg());
	}
}
