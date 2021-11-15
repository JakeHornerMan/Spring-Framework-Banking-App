package com.jake.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return ("<h1>Wecome to Banking App</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Wecome User</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return ("<h1>Wecome Admin</h1>");
	}

}
