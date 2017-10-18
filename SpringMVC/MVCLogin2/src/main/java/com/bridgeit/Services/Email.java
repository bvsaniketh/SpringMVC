package com.bridgeit.Services;

import java.util.Properties;
import java.util.Random;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.bridgeit.Model.Register;

@Service
public class Email {
	
	
	public String generateotp()
	{
		String alpha="abcdefghijklmnoprstuvwxyz";
		String numbers="0123456789";		
		String otp=alpha+numbers;
		char [] password=new char[8];
		for(int i=0;i<8;i++)
		{
			password[i]=otp.charAt(new Random().nextInt(otp.length()));
		}
		System.out.println(password);
		
		
			return new String(password);
			}

	public String sendEmail(Register reg)
	{
		String otp1=generateotp();
//		System.out.println(otp1 +"helllooo");
		Properties properties=new Properties();
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port","465");
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.port","465");
		
		Session session=Session.getDefaultInstance(properties,new javax.mail.Authenticator()
				{
			protected PasswordAuthentication getPasswordAuthentication()
				{
				return new PasswordAuthentication("bondadavenkatasai.aniketh2013@vit.ac.in","gilchrist319");
				}
				}
				);
		MimeMessage message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("bondadavenkatasai.aniketh2013@vit.ac.in"));
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(reg.getEmail()));
			message.setSubject("Your OTP");
			message.setText("Test message"+ " "+otp1);
			Transport.send(message);
			
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return otp1;
	}
	
}
