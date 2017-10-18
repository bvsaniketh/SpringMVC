package com.bridgeit.Controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.DAO.UserMapperImpl;
import com.bridgeit.Model.Register;
import com.bridgeit.Services.JWT;
import com.bridgeit.Services.RedisService;
import com.bridgeit.Services.UserService;
import com.bridgeit.Validators.FormValidator;

@Controller
public class RegistrationController {
	//UserMapperImpl impl=new UserMapperImpl();
	private final static Logger logger=Logger.getLogger(RegistrationController.class);
	String CLIENT_ID="12345";
	final static String CLIENT_SECRET="abcdefghijklmnopqrstuvwxyz";
	@Autowired
	UserService service;
	@Autowired
	FormValidator formvalid;
	@Autowired
	RedisService redisservice;
	
	@RequestMapping(value="Register",method=RequestMethod.GET)
	public ModelAndView doregistrationbean()
	{
		ModelAndView mav =new ModelAndView("register");
		mav.addObject("user1",new Register());
		System.out.println(mav);
		return mav;
	}
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String adduser(@ModelAttribute("user1") Register user,BindingResult res,ModelMap ma)
	{
		 System.out.println(user);
		// ModelAndView mav=new ModelAndView("login","Registration",user);
		// System.out.println(mav);
		// impl.insertUser(user);
		 
		 formvalid.validate(user, res);
		 
		 if(res.hasErrors())
			 
		 {
			 return "register";
		 }
		 service.insertuser(user);
		 ma.addAttribute("reg","User has been Registered sucessfully");
//		 String token=JWT.getToken(CLIENT_SECRET);
//		 logger.info(token);
//		 System.out.println(token);
//		 System.out.println(modelmap);
		 //ModelAndView mav=new ModelAndView
		 
		 //return "redirect:/" ;
		 
		 return "register";
	}
	@RequestMapping(value="JWTToken")
	
	public void generatetoken()
	{
		 String token=JWT.getToken(CLIENT_SECRET);
		 logger.info(token);
		 System.out.println(token);
		 logger.info("After sending to redis");
		 redisservice.sendtokenredis(CLIENT_ID, token);
		 logger.info("After fetching the value from Redis");
		 redisservice.gettokenfromredis(CLIENT_ID);
		 
	}
	
	
	
}
