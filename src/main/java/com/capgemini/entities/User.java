package com.capgemini.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@Column(nullable = false, unique = true)
	private String userId;

	@Column(nullable = false)
	private String password;

	public User() {
		super();
	}

	public User(String userId, String email, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}