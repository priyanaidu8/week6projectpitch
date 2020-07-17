package com.priya.week6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	
	@RequestMapping("/home")
	
	public String showHomepage() {
		System.out.println("Controller invoked");
		return "home";
	
	}
}
