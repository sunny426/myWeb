package com.my.web.xyz.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.my.web.xyz.dto.CourseDto;
import com.my.web.xyz.model.Course;
import com.my.web.xyz.repository.MyWebRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CourseServiceImpl implements CourseService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MyWebRepository repo;

	@Override
	public Course getCourse(int courseId) {
		
		return repo.findByCourseId(courseId);
	}

	@Override
	public ArrayList<Course> getCourses() {

		return (ArrayList<Course>) repo.findAll();
	}

	@Override
	public String saveCourse(CourseDto body) {

		logger.info("Course"+body.toString());
		return "success";
	}

}
