package com.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
	
	@RequestMapping("/calculate")
	public ModelAndView calculate(@RequestParam("t1") int t1 , @RequestParam("t2") int t2) {
		ModelAndView mv = new ModelAndView();
		int result = t1+t2;
		System.out.println("result " +result);
		mv.setViewName("/calculate");
		mv.addObject("result", result);
		return mv;
	}

}
