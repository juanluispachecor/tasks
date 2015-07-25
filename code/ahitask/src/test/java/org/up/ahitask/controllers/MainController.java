package org.up.ahitask.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	
	@RequestMapping("/tasks")
	public String tasksJSP(){
	return "tasks";
	}
	
}
