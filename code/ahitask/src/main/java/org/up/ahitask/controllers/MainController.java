package org.up.ahitask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value={"/","/home",""})
	public String home(){
		return "home";
	}
	
	@RequestMapping(value={"/newAccount"})
	public String newAccount(
			@RequestParam(value="name") String name,
			@RequestParam(value="secondName") String secondName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam(value="email") String email,
			@RequestParam(value="pass") String pass,
			@RequestParam(value="phone") String phone,
			@RequestParam(value="company") String company,Model model){
		
		
		model.addAttribute("text","hola"); 
		
		return "dashboard";
	}
	
	@RequestMapping(value="/dashboard/{userId:[0-9]+}")
	public String showDashboard(
			@PathVariable  String userId,
			@RequestParam(value="text",required=false) String text, Model model){
		
		model.addAttribute("text", text);
		System.out.println("User " + userId + " " + text);
		
		return "dashboard";	}

}
