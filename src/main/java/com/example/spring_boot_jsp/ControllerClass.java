package com.example.spring_boot_jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ControllerClass {

	// http://localhost:9001/second   ---> type on browser to get start
	@RequestMapping("/index")
	public ModelAndView real() {
	////ModelAndView Class is used Setview as well as addObject 
		
		ModelAndView modelview = new ModelAndView(); 
		modelview.setViewName("index");
		return modelview  ;
	}
	
	
	@RequestMapping("/second")
	public ModelAndView sec(@RequestParam("name") String name) {
		ModelAndView modelview = new ModelAndView();
		
		// url   http://localhost:9001/second?name=Value_Of_name --> To get data 
		modelview.addObject("name" , name);
		modelview.setViewName("second");
		return modelview ;
	}
	

	}

