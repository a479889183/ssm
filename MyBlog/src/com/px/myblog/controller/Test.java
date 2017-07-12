package com.px.myblog.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class Test {
	
	@RequestMapping("/login.action")
	public ModelAndView Test()
	{
       ModelAndView mv=new ModelAndView();

		mv.setViewName("index");
		return mv;
	}

}
