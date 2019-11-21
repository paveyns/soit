package com.soit;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class HelloSoitController {

	//controller method to view the form
	@RequestMapping("/viewForm")
	public String viewForm()
	{
		return "hellosoitform";
	}
	
	//controller method to process the form
	@RequestMapping("/processForm")
	public String processForm(@RequestParam ("facultyName") String Name, Model model) {
		//read the request param
		//String Name = request.getParameter("facultyName");
		
		//convert the inserted to all caps
		Name = Name.toUpperCase();
		
		//create message for the results
		String result = "Hello Professor " + Name;
		
		//add message to the results
		model.addAttribute("message", result);
		
		return "hellosoit";
	}
}
