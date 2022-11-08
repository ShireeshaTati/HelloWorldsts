package com.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HController {

	@GetMapping("/helo")
	public String msg() {
		return "Hello";
	}
}
