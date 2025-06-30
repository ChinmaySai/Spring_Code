package com.george.georgeschool.service;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.george.georgeschool.model.Contact;

@Slf4j
@Service
@ApplicationScope
public class ContactService {
	
	private int counter=0;
	
	public ContactService()
	{
		System.out.println("ContactService Bean Intialized");
	}

	//private Logger log=LoggerFactory.getLogger(ContactService.class);
	public boolean saveMessage(Contact contact) {

		boolean isSaved=true;
		log.info(contact.toString());
		return isSaved;
	}
	public int getCounter()
	{
		return counter;
	}
	public void setCounter(int counter)
	{
		this.counter=counter;
	}

	
}
