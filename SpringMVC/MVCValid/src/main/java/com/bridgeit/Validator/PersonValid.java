package com.bridgeit.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bridgeit.Model.Person;

public class PersonValid implements Validator {
	
	Pattern pattern;
	Matcher matcher;
	public boolean supports(Class clazz)
	{
		return Person.class.equals(clazz);
	}
	
	public void validate(Object obj,Errors e)
	{
		ValidationUtils.rejectIfEmpty(e,"name","error.name","Invalid Username");
		Person p=(Person) obj;
		if(p.getAge()<0)
		{
			e.rejectValue("age","error.age","negative value");
		}
		else if(p.getAge()>150)
		{
			e.rejectValue("age","error.age","Can't be that old !");
		}
	}
	
}
