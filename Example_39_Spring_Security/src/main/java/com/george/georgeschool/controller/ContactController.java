package com.george.georgeschool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.george.georgeschool.model.Contact;
import com.george.georgeschool.service.ContactService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ContactController {
	
	private Logger log=LoggerFactory.getLogger(ContactController.class);
	
	ContactService contactservice;
	
    
	public ContactService getContactservice() {
		return contactservice;
	}

	@Autowired
	public void setContactservice(ContactService contactservice) {
		this.contactservice = contactservice;
	}

	@RequestMapping(value={"/contact"})
	public String displayContact(Model model)
	{
		model.addAttribute("contact",new Contact());	
		return "contact.html";
	}
	/*
	
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
	}*/
	

	@PostMapping(value={"/saveMsg"})
	public String saveMessage(@Valid @ModelAttribute("contact") Contact contact,Errors error)
	{
		if(error.hasErrors())
		{
			log.error("Contact Form validation failed due to :"+error.toString());
			return "contact.html";
		}
		contactservice.saveMessage(contact);
		return "redirect:/contact";
	}
}
