package com.my.web.xyz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CourseDto {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("description")
	private String description;

	public CourseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseDto(String name, String title, String description) {
		super();
		this.name = name;
		this.title = title;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CourseDto [name=" + name + ", title=" + title + ", description=" + description + "]";
	}
	
	
}
