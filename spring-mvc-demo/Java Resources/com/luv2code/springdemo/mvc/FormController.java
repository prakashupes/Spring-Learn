package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	/*
	 * In simple term, @RequestMapping() does that what ever we pass as parameter here,
	 *  So when we access that as URl then return page will open. (And this is feauture of contoller, it returns the HTML/JSP page/view.
	 *  
	 *  Steps involved in this example:
	 *  1. Home page will open since we have provided route dirctory, (/) in requestMapping
	 *  2. From home page it will access a page via href, ie. /showForm, 
	 *  so it will open input-form.jsp, since @RequestMapping(/showForm) will return that page.
	 *  
	 *  3. When we click form submit button then, it will redirect /viewForm URl and @RequestMapping will retuern to output page
	 *  
	 * 
	 */
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
	
	
	/*
	 * 
	 */

}
