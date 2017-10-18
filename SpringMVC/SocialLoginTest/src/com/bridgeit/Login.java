package com.bridgeit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Servlet implementation class Login
 */

/*public class Setup {

	private static final String  CLIENT_ID="948035486059-ha0v7orrbp2btbbs0lo0g55h40gah113.apps.googleusercontent.com";
	private static final String  CLIENT_SECRET="qlK2HmoElrfyBrcwTlHDZJGC";
	private static final String  REDIRECT_URL="http://localhost:8080/SocialLoginTest/login";
}*/


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public Login() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out =response.getWriter();
		
		String code=request.getParameter("code");
		System.out.println(code);
		String urlParameters="code="+code+"&client_id=948035486059-ha0v7orrbp2btbbs0lo0g55h40gah113.apps.googleusercontent.com"
				+"&client_secret=qlK2HmoElrfyBrcwTlHDZJGC"+"&redirect_uri=http://localhost:8080/SocialLoginTest/login"+"&grant_type=authorization_code";
		
		//Generating Token
		URL url=new URL("https://accounts.google.com/o/oauth2/token");
		URLConnection urlConn= url.openConnection();
		urlConn.setDoOutput(true);
		OutputStreamWriter writer=new OutputStreamWriter(urlConn.getOutputStream());
		writer.write(urlParameters);
		writer.flush();
		String line,outputString="";
		BufferedReader reader=new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		while((line=reader.readLine())!=null)
		{
			outputString+=line;
		}
		System.out.println(outputString);
		JsonObject json=(JsonObject) new JsonParser().parse(outputString);
		String access_token=json.get("access_token").getAsString();
		System.out.println(access_token);
		
		//Display User Info
		url=new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token="+access_token);
		urlConn=url.openConnection();
		outputString="";
		reader=new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
		while((line=reader.readLine())!=null)
		{
			outputString+=line;
		}
		System.out.println(outputString);
		
		UserDetails user= new Gson().fromJson(outputString, UserDetails.class);
		System.out.println("The details are as follows "+ user);
		out.print(user);
		writer.close();
		reader.close();
	}


}
