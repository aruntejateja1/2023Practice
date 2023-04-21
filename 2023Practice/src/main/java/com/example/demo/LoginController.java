package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.User;





@Controller
public class LoginController {

	
	
	/* @GetMapping("index") public String showLogin() { return "index"; } */
	 


	
	@GetMapping("index")
	public String showLogin( @ModelAttribute User user) {
		return "index";
	}
	 
	@PostMapping("loginUser")
	public String loginUser(@Valid @ModelAttribute User user,Model model,BindingResult result) {
		
		if (user.getName().equals("abc") && user.getPassword().equals("cts1")) {
			model.addAttribute("name", user.getName());

			return "home";
		} else {
			model.addAttribute("error", "Invalid Credentials");

			return "index";
		}
	
	}
}