package com.myspringtut;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller

public class HelloController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String display(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

	      return "hello";
	}
}
