package com.eventfull.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.eventfull.demo.model.entities.EventEntity;
import com.eventfull.demo.model.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<EventEntity> listEvents(){
		return eventRepository.findAll();
	}
	
	public EventEntity createEvent(EventEntity eventEntity) {
		return eventRepository.save(eventEntity);
	}

	public void delete(String id) {
		EventEntity event = eventRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Event Id was not found in the database"));
		eventRepository.delete(event);
	}
}
