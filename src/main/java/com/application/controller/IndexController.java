package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	public String index()
	{
		
		
		return "WEB-INF/jsp/index.jsp";
	}

}
