package com.di1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/di1/applicationContext.xml");
		try {
			UserBean bean = (UserBean)context.getBean("userBean"); 
			bean.write();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			context.close();
		}
	}
}
