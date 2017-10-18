/*package com.bridgeit.Controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bridgeit.JSON.Response;
import com.bridgeit.Model.Register;
import com.bridgeit.Services.UserService;
import com.bridgeit.Validators.FormValidator;

@Controller
public class FundooRegisterController {

	@Autowired
	UserService service;
	@Autowired
	FormValidator formvalid;
	
	private Logger logger=Logger.getLogger(FundooRegisterController.class);
	
	@RequestMapping(value="register", method=RequestMethod.POST, consumes="application/json")
	public @ResponseBody ResponseEntity<Response>registeruser(@RequestBody Register user,BindingResult bindResult)
	{
		System.out.println("gdukzfhkshdkfhskdfhsklfhdl");
		logger.info("In register controller");
		Response resp=null;
		formvalid.validate(user, bindResult);
		if(bindResult.hasErrors())
		{
			logger.info("Errors while validating");
			logger.info(bindResult.getFieldError().toString());
			resp.setStatus(-1);
			resp.setMessage("Invalid Details Entered");
			return new ResponseEntity<Response>(HttpStatus.BAD_REQUEST);
		}
		if(service.checkUserByEmail(user.getEmail())!=null)
		{
			logger.info("Email already exists");
			resp.setStatus(-1);
			resp.setMessage("User already exists");
			return new ResponseEntity<Response>(HttpStatus.NOT_FOUND);
		}
		try
		{
		service.insertuser(user);
		logger.info("Registered");
		resp.setStatus(200);
		resp.setMessage("User registered");
		return new ResponseEntity<Response>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			logger.info("Exception Occured");
			resp.setStatus(404);
			resp.setMessage("Internal Server Error");
			return new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	@RequestMapping(value="test" )
	public void Test()
	{
		System.out.println("TEst");
		
	}
	
}
*/