package com.di3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
	private String name;
	private Map<String, String> address;
	private List<String> hobby;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAddress(Map<String, String> address) {
		this.address = address;
	}


	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}


	@Override
	public String msg() {
		// TODO Auto-generated method stub
		String s="이름:"+name+"\n";
		s+="------------\n";
		s+="친구주소록-----\n";
		
		Iterator<String> it = address.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=address.get(key);
			s+=key+":"+value+"\n";
		}
		s+="------------\n";
		s+="취미...\n";
		for (String h : hobby) {
			s+=h+" ";
		}
		return s;
	}
	
}
