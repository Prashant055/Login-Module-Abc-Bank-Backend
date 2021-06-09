package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registrations")
public class Registration {
	@Id
	private String email;

	@Column(nullable = false)
	private String userName;

	@Column(nullable = false)
	private String userPan;

	@Column(nullable = false)
	private String userNumber;

	@Column(nullable = false)
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPan() {
		return userPan;
	}

	public void setUserPan(String userPan) {
		this.userPan = userPan;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}