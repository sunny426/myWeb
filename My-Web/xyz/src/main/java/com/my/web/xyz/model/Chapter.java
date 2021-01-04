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
@Table(name="CHAPTER")
public class Chapter {
	
	@Id
	@GeneratedValue
	@Column(name = "CHAPTER_ID")
	private int chapterId;
	
	@NotNull
	@Column(name = "COURSE_ID")
	private int courseId;
	
	@NotNull
	@Column(name = "TITLE")
	private String title;
	
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;

}