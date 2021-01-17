package com.saleh.mytest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping(value={"/", "/index"})
	public String getHomePage(Model model) {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String getLoginPage(Model model) {
		return "login";
	}
	
	@GetMapping(value = "/logout-success")
	public String getLogoutPage(Model model) {
		return "logout";
	}
	
	@GetMapping("/user")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String getUser() {
		return ("Welcome, user");
	}
	
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String getAdmin() {
		return ("Welcome, admin");
	}
}
