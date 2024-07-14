package com.nabil.DevsOnDeck.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nabil.DevsOnDeck.models.Developer;
import com.nabil.DevsOnDeck.models.Message;


public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByReceiver(Developer receiver);
    List<Message> findByReceiverOrderBySender(Developer receiver);
    List<Message> findAll();
    List<Message> getMessageContentsByReceiver(Developer receiver);
    List<Message> findByReceiverId(Long receiverId);
    
 // Count the number of messages for a given receiver
    long countByReceiver(Developer receiver);

  
}