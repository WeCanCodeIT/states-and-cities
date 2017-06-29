package com.evie.usa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy="state")
	private Set<City> cities;
	
	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public State(String name) {
		this.name = name;
	}

	public State() {
	}

}
