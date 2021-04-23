package net.codejava.MySpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.MySpringMVC.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/userList")
	public ModelAndView userList(){
		return new ModelAndView("user","userListMessage","List Of User Return");
	}
	
	@RequestMapping(value="/deleteList")
	public ModelAndView deleteUser(User user){
		return new ModelAndView("deleteUser","deleteUserList","Delete user List from user");
	}
	
	@RequestMapping(value="/updateUserList")
	public ModelAndView updateUser(User user){
	return new ModelAndView("updateUser","updateUserList","Update User List");
	}
	

}