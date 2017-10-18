package com.bridgelabz.note.controller;

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

import com.bridgelabz.note.json.Response;
import com.bridgelabz.note.model.User;
import com.bridgelabz.note.json.SignUpErrorResponse;
import com.bridgelabz.note.services.UserService;
import com.bridgelabz.note.validator.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserValidator userValidator;
	
	private Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes="application/json", produces="application/json")
	public @ResponseBody ResponseEntity<Response> insertUser(@RequestBody User user, BindingResult bindResult) {
        System.out.println("Entered insertUser()");
		logger.info("Entered insertUser()");
		Response resp;
		userValidator.validate(user, bindResult);
		if (bindResult.hasErrors()) {
			logger.info("has errors while validating");
			logger.info(bindResult.getFieldErrors().toString());
			resp = new Response();
			resp.setStatus(-1);
			resp.setMsg("Entered invalid details");
			return new ResponseEntity<Response>(resp, HttpStatus.BAD_REQUEST);
		}
		if (userService.getUserByEmailID(user.getEmail()) != null) {
			logger.info("email already exists");
			resp = new Response();
			resp.setStatus(-1);
			resp.setMsg("User already exist");
			return new ResponseEntity<Response>(resp, HttpStatus.CONFLICT);
		}
		try {
			userService.register(user);
			logger.info("registered");
			resp = new SignUpErrorResponse();
			resp.setStatus(1);
			resp.setMsg("User registered successfully!!!");
			return new ResponseEntity<Response>(HttpStatus.OK);
		} catch (Exception e) {
			logger.info("EXCEPTION OCCURED");
			resp = new SignUpErrorResponse();
			resp.setStatus(-1);
			resp.setMsg("Internal server error");
			return new ResponseEntity<Response>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	} 
	@RequestMapping("/test2")
	public void test() {
		System.out.println("test()--");
	}
}
