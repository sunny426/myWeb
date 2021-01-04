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
@Table(name="CONTROL_TEST")
public class ControlTest {
	
	@Id
	@GeneratedValue
	@Column(name = "CONTROL_TEST_ID")
	private int controlTestId;
	
	@NotNull
	@Column(name = "CHAPTER_ID")
	private int chapterId;
	
	@NotNull
	@Column(name = "QUESTION")
	private String question;
	
	@NotNull
	@Column(name = "ANSWER")
	private String answer;
	

}
