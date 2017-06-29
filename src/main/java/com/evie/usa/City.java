package com.evie.usa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {

@Id
@GeneratedValue
private Long id;

@ManyToOne
private State state;

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

private String name;

public Long getId() {
	return id;
}

public City(State state, String name) {
	this.state = state;
	this.name = name;
}

public  String getName() {
	return name;
}

private City() {
} 
}
