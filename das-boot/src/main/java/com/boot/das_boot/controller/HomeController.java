package com.boot.das_boot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "das boot";
	}
}
