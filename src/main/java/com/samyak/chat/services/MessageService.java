package com.samyak.chat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samyak.chat.dao.MessageDao;
import com.samyak.chat.models.Message;

@Transactional
@Service
public class MessageService implements MessageServiceInterface{

	@Autowired
	private MessageDao messageService;
	
	@Override
	public void insertMessage(Message m) {
		messageService.save(m);
	}
	
}
