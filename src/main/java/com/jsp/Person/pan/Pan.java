package com.jsp.Person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private int id;
	private String gst_numbar;
	@OneToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGst_numbar() {
		return gst_numbar;
	}
	public void setGst_numbar(String gst_numbar) {
		this.gst_numbar = gst_numbar;
	}
	
	
}
