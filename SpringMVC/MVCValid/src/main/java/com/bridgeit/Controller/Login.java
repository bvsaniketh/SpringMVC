package com.bridgeit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.Model.Person;
import com.bridgeit.Validator.PersonValid;

@Controller
public class Login {
	
	@Autowired
	PersonValid pv;

	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public String indexpage()
	{
		//ModelAndView mav=new ModelAndView("index");
		return "index";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	
	public ModelAndView getage()
	{
		ModelAndView mav=new ModelAndView("login");
		mav.addObject("user", new Person());
		System.out.println(mav +"hello");
		return mav;
		
	}
	
	
	@RequestMapping(value="welcome",method=RequestMethod.POST)
	
	public String getdata(@ModelAttribute("user") Person user,BindingResult res,ModelMap ma)
	{
		pv.validate(user, res);
		
		System.out.println(user + " " +res);
		
		if(res.hasErrors())
		{
			return "login";
		}
			ma.addAttribute("user", user.getName() + " " + user.getAge());
			System.out.println(user.getAge());
			return "welcome";
		
	}
	
}
