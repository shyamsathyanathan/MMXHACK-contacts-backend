package com.mmxhack.contactsbank.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="contacts_mapper", uniqueConstraints=@UniqueConstraint(columnNames={"date", "owner"}))
public class ContactsMapper {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="owner")
	private String owner;
	
	@OneToMany(mappedBy = "changeCounter", fetch = FetchType.LAZY)
	private Set<Contact> contactsUpdated = new HashSet<Contact>();

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
