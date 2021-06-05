package com.samyak.chat.models;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "user")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User user;
	
	private String message;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public Message(User user, String message) {
		super();
		this.user = user;
		this.message = message;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
