package com.javareactapp.springbootfullstackcrudwithmaven.models;

public class Course {
	private Long id;
	private String username;
	private String description;
	//constructior with 3 args
	public Course(Long id, String username, String description) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
	}
	//getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	//hashcode and equals?
}
