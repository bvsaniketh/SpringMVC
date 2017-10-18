package com.bridgeit.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.PathParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.Model.Login;
import com.bridgeit.Model.Register;
import com.bridgeit.Services.GoogleLogin;
import com.bridgeit.Services.UserService;

@Controller
public class LoginController {
	private static Logger logger=Logger.getLogger(LoginController.class);
	@Autowired
	UserService service;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView dologinbean()
	{
		
		ModelAndView mav=new ModelAndView("login");
		Login loginuser=new Login();
		mav.addObject("loginuser",loginuser);
		logger.info("message");
		System.out.println("Inside home page");
		return mav;
		
	}
	
	@RequestMapping(value="lo",method=RequestMethod.GET)
	public ModelAndView dologinbean1()
	{
		
		ModelAndView mav=new ModelAndView("login");
		Login loginuser=new Login();
		mav.addObject("loginuser",loginuser);
		return mav;
		
	}

	@RequestMapping(value="login",method=RequestMethod.GET)
	public ModelAndView dologinbean2(HttpSession session)
	{
		if(session!=null)
		{
			ModelAndView mav1=new ModelAndView("welcomelogin");
//			mav.addObject("logins",loginuser);
			return mav1;
		}
		
		ModelAndView mav=new ModelAndView("login");
		Login loginuser=new Login();
		mav.addObject("loginuser",loginuser);
		
		return mav;
		
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView loginuser(@ModelAttribute("loginuser")@PathParam("loginuser") Login loginuser,HttpServletRequest request,HttpSession session)
	{
		
		System.out.println(loginuser.getUsername());
		//ModelAndView mav=new ModelAndView("welcomelogin","Login",loginuser);
		Register reg=service.getUser(loginuser);
		ModelAndView mav=null;
		if(reg!=null)
		{
		 session=request.getSession(true);
		 session.setAttribute("session",loginuser);
		 System.out.println(session);
		 System.out.println(reg.getUsername() +" "+reg.getPassword()+ reg.getAge());
		 mav=new ModelAndView("welcomelogin","logins",reg);
		}
		else
		{
		mav=new ModelAndView("login","message","Invalid Login");
		}
	return mav;
	}
	@RequestMapping(value="logout")
	public ModelAndView logout(HttpServletRequest request,HttpSession session)
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("loginuser", new Login());
		session =request.getSession();
		System.out.println(session);
		session.invalidate();
		return mv;
	}
	
	@RequestMapping(value="googlelogin")
	public String googlelogin(HttpServletRequest request,HttpSession session)
	{
		System.out.println("Controller -> googlelogin");
		String code=request.getParameter("code");
		System.out.println(code);
		Register user=GoogleLogin.glogin(code);
		System.out.println("Hi Dude");
		System.out.println(user+" Hi Bro");
		String a=user.getEmail();
		System.out.println(a);
		Register user1=service.checkUserByEmail(a);
		System.out.println("This is the user after email "+ user1);
		session=request.getSession(true);
		if(user1==null)
		{
			service.insertuser(user);
			session.setAttribute("session",user);
			request.setAttribute("logins",user );
		}
		else
		{
			session.setAttribute("session",user);
			request.setAttribute("logins",user1);
		}
		 
		 System.out.println(session);
		return "welcomelogin";
	}

	
}
