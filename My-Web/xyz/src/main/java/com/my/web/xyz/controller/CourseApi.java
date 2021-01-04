package com.my.web.xyz.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.my.web.xyz.dto.CourseDto;

public interface CourseApi {
	
	@GetMapping(value = "/project/course/{courseId}",
	        produces = { "application/json" })
	ResponseEntity<Object> getCourse(@PathVariable("courseId") int courseId);
	
	@GetMapping(value = "/project/course",
	        produces = { "application/json" })
	ResponseEntity<Object> getCourses();
	
	@PutMapping(value = "/nf-instances/CourseSave",
	        produces = { "application/json" }, 
	        consumes = { "application/json" })
	ResponseEntity<Object> saveCourse(@RequestBody CourseDto body, BindingResult bindingResult);

}
