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
	public ModelAndView test(HttpServletResponse response) throws IOException{
		System.out.println("Inside Controller.....");
		Date date = new Date();
		return new ModelAndView("home","userName",""+helloworldservice.welcomeMessage() +"::::Time::::"+date); //1.logical view name 2.Key variable present on jsp 3.ACtual msg which is displaying.
	}
	
	@RequestMapping(value="welcomeAgain" ,method=RequestMethod.GET)
	public ModelAndView welcomeAgain(){
		System.out.println("Inside Controller again.....");
		return new ModelAndView("home","userName",helloworldservice.welcomeAgainMessage());
		
	}
}
