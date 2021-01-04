package com.my.web.xyz.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name = "COURSE_ID")
	private int courseId;
	
	@NotNull
	@Column(name = "JSONDATA" ,columnDefinition = "JSON") // Only if Database has JSON type else this line can be removed
	private String jsonData;
	
	/*
	 * @NotNull
	 * 
	 * @Column(name = "NAME") private String name;
	 * 
	 * @NotNull
	 * 
	 * @Column(name = "TITLE") private String title;
	 * 
	 * @Column(name = "DESCRIPTION") private String description;
	 */

}