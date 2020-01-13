package com.springdemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "employee")
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int id;
		
		@Column(name = "firstname")
		private String firstname;
		
		@Column(name = "lastname")
		private String lastname;
		
		@Column(name = "email")
		private String email;
		
		
		
	public Employee(String firstname, String lastname, String email) {
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
		}
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastName() {
			return lastname;
		}
		public void setLastName(String lastName) {
			this.lastname = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstname=" + firstname + ", lastName=" + lastname + ", email=" + email
					+ "]";
		}
		
		
		

	
}
