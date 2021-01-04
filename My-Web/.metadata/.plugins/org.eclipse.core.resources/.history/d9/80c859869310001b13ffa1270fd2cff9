package com.my.web.xyz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import com.my.web.xyz.dto.CourseDto;
import com.my.web.xyz.model.Course;
import com.my.web.xyz.service.CourseService;

@RestController
public class CourseController implements CourseApi{
	
	@Autowired
	CourseService courseService;

	@Override
	public ResponseEntity<Object> getCourse(int courseId) {
		
		Course data=courseService.getCourse(courseId);
		return ResponseEntity.ok().body(data);
	}

	@Override
	public ResponseEntity<Object> getCourses() {
		
		ArrayList<Course> data=courseService.getCourses();
		return ResponseEntity.ok().body(data);
	}

	@Override
	public ResponseEntity<Object> saveCourse(CourseDto body, BindingResult bindingResult) {

		String data = courseService.saveCourse(body);
		return ResponseEntity.ok().body(data);
	}
	
	

}
