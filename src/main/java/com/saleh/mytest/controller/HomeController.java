package com.saleh.mytest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getHome() {
		return ("Welcome, world");
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
