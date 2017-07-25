package com.example.jumee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GlinpController {
	
	@RequestMapping("/glinp")
	public String home() {
		return "This is Glinp!";
	}

	@RequestMapping("/hello")
	public List<String> hello() {
		return Arrays.asList(new String[] { "A", "B", "C" });
	}
}
