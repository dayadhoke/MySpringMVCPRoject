package net.codejava.MySpringMVC.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import net.codejava.MySpringMVC.model.*;
import net.codejava.MySpringMVC.service.HelloWorldService;

@Controller
public class HomeController {
	
	@Autowired
	HelloWorldService helloworldservice = new HelloWorldService();

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String test(HttpServletResponse response) throws IOException{
		System.out.println("Inside Controller.....");
		Date date = new Date();
		return "home";
	}
	
	
}
