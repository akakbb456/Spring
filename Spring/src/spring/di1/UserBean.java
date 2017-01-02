package spring.di1;

import org.springframework.beans.factory.annotation.Required;

public class UserBean {
	private UserService userService;

	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void execute() {
		System.out.println(userService.msg());
	}
}
