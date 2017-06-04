package com.hlss.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/")
	public String home1() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>home1");
		return "/home";
	}

	@GetMapping("/home")
	public String home() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>home");
		return "/home";
	}

	@GetMapping("/admin")
	public String admin() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>admin");
		return "/admin";
	}

	@GetMapping("/user")
	public String user() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>user");
		return "/user";
	}

	@GetMapping("/about")
	public String about() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>about");
		return "/about";
	}

	@GetMapping("/login")
	public String login() {
		System.out.println("DefaultController>>>>>>>>>>>>>>>>>>>>>>login");
		return "/login";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}

}
