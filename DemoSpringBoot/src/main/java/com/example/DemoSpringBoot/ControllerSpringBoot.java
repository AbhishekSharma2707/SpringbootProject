package com.example.DemoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSpringBoot {
	@RequestMapping("/show")
    public String show(String name) {
    	return "Hello! "+name;
    }
	
}
