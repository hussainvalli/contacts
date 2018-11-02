package com.agile.serviceimp;

import java.util.List;

import com.agile.dto.Contact;
import com.agile.service.MyService;

public class ServiceImp implements MyService{
	public void saveContact(Contact contact) {
		
	}
	public Contact updateContact(Contact contact) {
		return contact;
	}
	public List<Contact> listContact(){
		return listContact();
	}
	public Contact getContactById(int id) {
		return getContactById(id);
	}
	public void deleteContact(int id) {
		
	}
}
