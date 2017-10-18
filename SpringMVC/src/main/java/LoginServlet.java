package com.LoginSession;

import java.beans.PropertyVetoException;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("user");
		String pass1=request.getParameter("pass");
		pass1=PasswordEncryption.encrypt(pass1);
		JavaBean bean=new JavaBean();
		bean.setUsername(userName);
		bean.setPassword(pass1);
		try {
			bean=JDBC.login(bean);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(bean.isValid())
		{	
			
			HttpSession session=request.getSession();
			session.setAttribute("user", bean);
			//request.setAttribute("CurrentSessionUser", bean);
			
//			RequestDispatcher rd=request.getRequestDispatcher("/Wel");
//			rd.forward(request, response);
		 response.sendRedirect("welcome");
		}
		else
		{
			response.sendRedirect("fail.jsp");
		}
		
	}

}
