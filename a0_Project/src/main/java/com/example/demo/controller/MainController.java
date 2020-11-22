package com.example.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MainController {
	@RequestMapping(value = "/")
	//@ResponseBody
	public String hello() { 
		System.out.println("메인 페이지");
		//test1122aa 
		
		
		return "test";
	}
}
