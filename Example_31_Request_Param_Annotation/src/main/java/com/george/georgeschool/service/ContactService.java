package com.george.georgeschool.service;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.george.georgeschool.model.Contact;

@Slf4j
@Service
public class ContactService {

	//private Logger log=LoggerFactory.getLogger(ContactService.class);
	public boolean saveMessage(Contact contact) {

		boolean isSaved=true;
		log.info(contact.toString());
		return isSaved;
	}

	
}
