package com.mmxhack.contactsbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	
	private static final int UPDATE = 0;
	private static final int DELETE = 1;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="contact_id", nullable=false)
	private String contactId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone_numbers")
	private String phoneNumbers;
	
	@Column(name="email")
	private String email;
	
	@Column(name="status")
	private Status status;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@JoinColumn(name="change_counter")
	private long changeCounter;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static enum Status {
		UPDATE,
		DELETE
	}
	
}
