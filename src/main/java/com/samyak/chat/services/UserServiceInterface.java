package com.samyak.chat.services;
import java.util.*;
import com.samyak.chat.models.User;

public interface UserServiceInterface {
	public List<String> getUsers();
	public void insertUser(String name, String password);
	public void deleteUser(String name, String password);
	public User getUserById(int id);
	
}
