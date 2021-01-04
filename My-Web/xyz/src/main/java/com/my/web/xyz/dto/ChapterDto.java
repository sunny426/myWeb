package com.my.web.xyz.dto;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.my.web.xyz.model.Course;


public class ChapterDto {

    @JsonProperty("course")
	private Course course;
	
    @JsonProperty("title")
	private String title;
	
    @JsonProperty("description")
	private String description;

	public ChapterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChapterDto(Course course, String title, String description) {
		super();
		this.course = course;
		this.title = title;
		this.description = description;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
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
		return "ChapterDto [course=" + course + ", title=" + title + ", description=" + description + "]";
	}
    

}
