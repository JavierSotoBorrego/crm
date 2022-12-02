package com.crm.crm.model;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oportunities")
public class Oportunity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NonNull
	@Column(name = "name")
	private String name;

	@NonNull
	@Column(name = "surname")
	private String surname;

	@NonNull
	@Column(name = "typeContact")
	private String typeContact;

	@NonNull
	@Column(name = "clientBoolean")
	private Boolean clientBoolean;

	@NonNull
	@Column(name = "datecontact")
	private String datecontact;

	public Oportunity() {
		super();
	}

	public Oportunity(int id, String name, String surname, String typeContact, Boolean clientBoolean,
			String datecontact) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.typeContact = typeContact;
		this.clientBoolean = clientBoolean;
		this.datecontact = datecontact;
	}

	public Oportunity(String name, String surname, String typeContact, Boolean clientBoolean, String datecontact) {
		super();
		this.name = name;
		this.surname = surname;
		this.typeContact = typeContact;
		this.clientBoolean = clientBoolean;
		this.datecontact = datecontact;
	}

	
	

	public Oportunity(String name, String surname, String typeContact) {
		super();
		this.name = name;
		this.surname = surname;
		this.typeContact = typeContact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getTypeContact() {
		return typeContact;
	}

	public void setTypeContact(String typeContact) {
		this.typeContact = typeContact;
	}

	public Boolean getClientBoolean() {
		return clientBoolean;
	}

	public void setbClient(Boolean clientBoolean) {
		this.clientBoolean = clientBoolean;
	}

	public String getDatecontact() {
		return datecontact;
	}

	public void setDatecontact(String datecontact) {
		this.datecontact = datecontact;
	}

	@Override
	public String toString() {
		return "Oportunity [id=" + id + ", name=" + name + ", surname=" + surname + ", typeContact=" + typeContact
				+ ", bClient=" + clientBoolean + ", datecontact=" + datecontact + "]";
	}
	
}
