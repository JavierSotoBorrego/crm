package com.crm.crm.model;

import jakarta.persistence.*;

import java.util.Date;

import org.springframework.lang.NonNull;

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
	@Column(name = "bClient")
	private Boolean bClient;

	@NonNull
	@Column(name = "datecontact")
	private Date datecontact;

	public Oportunity() {
		super();
	}

	public Oportunity(int id, String name, String surname, String typeContact, Boolean bClient,
			Date datecontact) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.typeContact = typeContact;
		this.bClient = bClient;
		this.datecontact = datecontact;
	}

	public Oportunity(String name, String surname, String typeContact, Boolean bClient, Date datecontact) {
		super();
		this.name = name;
		this.surname = surname;
		this.typeContact = typeContact;
		this.bClient = bClient;
		this.datecontact = datecontact;
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

	public Boolean getbClient() {
		return bClient;
	}

	public void setbClient(Boolean bClient) {
		this.bClient = bClient;
	}

	public Date getDatecontact() {
		return datecontact;
	}

	public void setDatecontact(Date datecontact) {
		this.datecontact = datecontact;
	}

	@Override
	public String toString() {
		return "Oportunity [id=" + id + ", name=" + name + ", surname=" + surname + ", typeContact=" + typeContact
				+ ", bClient=" + bClient + ", datecontact=" + datecontact + "]";
	}
	
}
