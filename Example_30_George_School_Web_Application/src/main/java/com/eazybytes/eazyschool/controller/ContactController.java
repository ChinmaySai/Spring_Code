package com.eazybytes.eazyschool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContactController {
	
	private Logger log=LoggerFactory.getLogger(ContactController.class);

	@RequestMapping(value={"/contact"})
	public String displayContact()
	{
		return "contact.html";
	}
	
	//@RequestMapping(value= {"/saveMsg"},method = POST)
	@PostMapping(value="/saveMsg")
	public ModelAndView saveMessage(@RequestParam String name,
			@RequestParam String mobileNum,@RequestParam String email,
			@RequestParam String subject,@RequestParam String message)
	
	{
		log.info("name : "+name);
		log.info("mobileNum : "+mobileNum);
		log.info("email : "+email);
		log.info("subject :"+subject);
		log.info("message : "+message);
	return new ModelAndView("redirect:/contact");	
	}
}
