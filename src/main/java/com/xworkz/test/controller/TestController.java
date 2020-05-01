package com.xworkz.test.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	private static final Logger logger = Logger.getLogger(TestController.class);

	public TestController() {
		System.out.println("Created" + this.getClass().getSimpleName());
		logger.warn("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/getMessage.do")
	public String getMessage(ModelMap model) {
		System.out.println("invoked getMessage()");
		logger.warn("invoked getMessage()");
		model.addAttribute("message", "Hey Xworkz!!!");
		return "welcome";
	}
}
