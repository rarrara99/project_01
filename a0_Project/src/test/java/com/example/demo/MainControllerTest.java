package com.example.demo;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controller.MainController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void hello () throws Exception {
		String hello = "hello";
		
		mvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string(hello));
		
	}

}
