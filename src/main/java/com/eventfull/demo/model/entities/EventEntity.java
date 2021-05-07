package com.eventfull.demo.model.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Document(collection = "events")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {
	@Id
	private String id;
	private String name;
	//TODO work with GeoJson , lets first get started with the simple shit
	//private String location;
	private String description;
	private double price;
	private String time;
	
	public EventEntity(String name , String description , double price , String time ) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.time = time;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
