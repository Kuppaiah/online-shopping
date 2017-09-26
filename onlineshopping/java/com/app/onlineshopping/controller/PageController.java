package com.app.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
@RequestMapping(value={"/","/home","/index"})
public ModelAndView index()
{
	ModelAndView mav=new ModelAndView("page");
	mav.addObject("greeting", "welcome to spring web mvc");
	return mav;
}
}
