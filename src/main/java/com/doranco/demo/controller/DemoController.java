package com.doranco.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("")
	public String welcome()
	{
		return "spring is coming <a href='hello'> here</a>";
	}
	
	@GetMapping("/hello")
	public String sayHi()
	{
		return "hello spring";
	}
}
