package com.om.app.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Outh2Controller {

	@GetMapping("hello")
	public ModelAndView welcome(Principal principal) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Outhlogged");
		return mav;
	}
	
}
