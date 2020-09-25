package com.citisecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping(value="/helloall")
	public String login() {
		return "hello all";
	}
	
	@GetMapping(value="/hellouser")
	public String loginUser() {
		return "hello user";
	}
	
	@GetMapping(value="/helloadmin")
	public String loginAdmin() {
		return "hello admin";
	}
}
