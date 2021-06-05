package com.samyak.chat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.samyak.chat.models.Message;
import com.samyak.chat.models.User;
import com.samyak.chat.services.MessageService;
import com.samyak.chat.services.UserService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService service;
	
	@Autowired
	private UserService u_service;
	
//	@PostMapping("/message")
//	public ResponseEntity<HttpStatus> insertMessage(@RequestBody  Map<String, Object> data) {
////		System.out.println(data);
//		User user = u_service.getUserById((int)data.get("user"));
////		System.out.println(user);
//		if(user!=null) {
//			Message m = new Message(user, (String) data.get("message"));
//			service.insertMessage(m);
//			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED); 
//		}
//		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
//	}
	
}
