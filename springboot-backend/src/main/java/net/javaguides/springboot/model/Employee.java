package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(name = "first_name")
	public String firstName;
	@Column(name = "last_name")
	public String lastName;
	@Column(name = "email_id")
	public String emailID;
	
	
	public Employee() {
	
	}
	
	public Employee(String firstName, String lastName, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	
}
