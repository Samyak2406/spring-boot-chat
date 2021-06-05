package com.samyak.chat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.samyak.chat.models.User;
import com.samyak.chat.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public List<String> getUsers(){
		return service.getUsers();
	}
	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertUser(@RequestBody User user) {
		service.insertUser(user.getEmail(), user.getPassword());
	}
	
	@DeleteMapping("/users")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@RequestBody User user) {
		service.deleteUser(user.getEmail(), user.getPassword());
	}
	
	
	
	
}
