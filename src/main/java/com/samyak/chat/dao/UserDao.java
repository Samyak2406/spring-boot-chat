package com.samyak.chat.dao;

import com.samyak.chat.models.User;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.samyak.chat.models.User;

public interface UserDao extends CrudRepository<User, Integer>{

	@Query(value = "select email from user;", nativeQuery = true)
	public List<String> getUsers();
	
	@Modifying
	@Query(value = "insert into user(email, password) values(:email, :password)", nativeQuery = true)
	public void insertUser(@Param("email") String email, @Param("password") String password);

	@Modifying
	@Query(value = "delete from user where email = :email and password = :password", nativeQuery = true)
	public void deleteUser(@Param("email") String email, @Param("password") String password);
	
	@Query(value = "select * from user where id = :id", nativeQuery = true)
	public List<User> getUserById(@Param("id") int id);
	
}
