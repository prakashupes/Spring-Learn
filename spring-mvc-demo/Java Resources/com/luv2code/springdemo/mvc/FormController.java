package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String inputForm()
	{
		return "input-form";
	}
	@RequestMapping("/viewForm")
	public String processForm()
	{
		return "output-form";
	}
	
	
	@RequestMapping("/knowMore")
	public String knowMore()
	{
		return "knowmore-page";
	}

}
