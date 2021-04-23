package net.codejava.MySpringMVC.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String welcomeMessage(){
		System.out.println("Inside Service Layer!!!!!");
		return "Welcome to Spring MVC world!!!!";
	}
	
	public String welcomeAgainMessage(){
		System.out.println("inside welcome again service....");		
		return "Welcome to Spring MVC world!!!! Again";
	}
}
