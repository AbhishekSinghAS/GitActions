package com.Abhishek;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class FirstController {
	
	@RequestMapping(value="/Calculate",params="add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("val1"));
		int b = Integer.parseInt(request.getParameter("val2"));
		int addition = a + b;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("AfterAddition.jsp");
		view.addObject("Answer",addition); 
		return view;
		
	}
	/*@RequestMapping("/Calculate/add/{num1}/{num2}")
	public ModelAndView add(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		int add = num1+num2;
		ModelAndView view = new ModelAndView();
		view.setViewName("AfterAddition.jsp");
		view.addObject("Answer",add);
		return view;
	}
	*/
	@RequestMapping(value="/Calculate",params="divide")
	public ModelAndView divide(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("val1"));
		int b = Integer.parseInt(request.getParameter("val2"));
		if (b==0) {
			String division = "Division By Zero Error";
			ModelAndView view = new ModelAndView();
			view.setViewName("AfterDivision.jsp");
			view.addObject("Answer",division);
			return view;	
		}
		int division = a / b;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("AfterDivision.jsp");
		view.addObject("Answer",division);
		return view;
		
	}
	
	@RequestMapping(value="/Calculate",params="multiply")
	public ModelAndView multiply(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("val1"));
		int b = Integer.parseInt(request.getParameter("val2"));
		int multiple = a * b;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("AfterMultiplication.jsp");
		view.addObject("Answer",multiple);
		return view;
		
	}
	
	@RequestMapping(value="/Calculate",params="difference")
	public ModelAndView difference(HttpServletRequest request, HttpServletResponse response) {
		int a = Integer.parseInt(request.getParameter("val1"));
		int b = Integer.parseInt(request.getParameter("val2"));
		int difference = a - b;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("AfterSubtraction.jsp");
		view.addObject("Answer",difference);
		return view;
		
	}
	

}



