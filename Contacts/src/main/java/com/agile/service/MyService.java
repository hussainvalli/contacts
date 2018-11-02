package com.agile.service;

import java.util.List;

import com.agile.dto.Contact;

public interface MyService {
	public void saveContact(Contact contact);
	public Contact updateContact(Contact contact);
	public List<Contact> listContact();
	public Contact getContactById(int id);
	public void deleteContact(int id);
}
