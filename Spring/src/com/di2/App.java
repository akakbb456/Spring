package com.di2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/di2/applicationContext.xml");
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("classpath:com/di2/applicationContext.xml");
		try {
			//UserBean bean = (UserBean)context.getBean("userBean");
			UserBean bean = context.getBean(UserBean.class);
			bean.print();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			context.close();
		}
	}
}
