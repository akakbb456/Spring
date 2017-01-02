package com.di1.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// 스프링 컨테이너
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/di2/applicationContext.xml");
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("com/di1/scope2/applicationContext.xml");
		try {
			Movie movie = context.getBean(Movie.class);
			Music music = context.getBean(Music.class);
			
			movie.play();
			music.play();
			
			movie.play();
			music.play();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			context.close();
		}
	}
}
