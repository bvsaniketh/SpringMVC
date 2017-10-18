package com.LoginSession;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter{

	public void init(FilterConfig arg0) throws ServletException{}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res= (HttpServletResponse) response;
		HttpSession session=req.getSession();
		JavaBean bean;
		bean = (JavaBean)session.getAttribute("user"); 

		
		
		if(bean==null)
		{	
			
			
			res.sendRedirect("index.jsp?user=Invalid_Session_Login_Again");
			
			
		}
		else
		{
			chain.doFilter(request,response);
		}

	}
	
	public void destroy() {}
}
