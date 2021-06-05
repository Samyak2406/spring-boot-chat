package com.samyak.chat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.samyak.chat.models.Message;

public interface MessageDao extends JpaRepository<Message, Integer>{

	
}
