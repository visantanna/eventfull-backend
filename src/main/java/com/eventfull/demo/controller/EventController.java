package com.eventfull.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventfull.demo.model.entities.EventEntity;
import com.eventfull.demo.model.repositories.EventRepository;
import com.eventfull.demo.services.EventService;

@RestController
public class EventController {
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/events/")
	public List<EventEntity> getAllEvents(){
		return eventService.listEvents();
	}
	
	@PostMapping("/events/")
	public EventEntity postEvent(@RequestBody EventEntity event) {
		return eventService.createEvent(event);
		
	}
	
	@DeleteMapping("/events/delete/{id}")
	public void deleteEvent(@PathVariable String id ) {
		eventService.delete(id);
	}
}
