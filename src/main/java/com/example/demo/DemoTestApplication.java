package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class DemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTestApplication.class, args);
	}

	@RequestMapping(value = "/greeting")
	public ModelAndView test(ModelAndView mv) {
		mv.setViewName("greeting");
		mv.addObject("title","欢迎使用Thymeleaf!");
		return mv;
	}
}
