package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Example;
import com.example.demo.service.HelloOracleService;

@Controller
public class HelloOracleController {
	
	@Autowired
	private HelloOracleService helloOracleService;
	
	@GetMapping("/helloOracle")
	public String toHelloOracle(Model model) {
		Example ex = helloOracleService.helloOracle();
		model.addAttribute("example", ex);
		return "helloOracle";
	}

}
