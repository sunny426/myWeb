package com.my.web.xyz.service;

import java.util.ArrayList;

import com.my.web.xyz.dto.CourseDto;
import com.my.web.xyz.model.Course;

public interface CourseService {

	public Course getCourse(int courseId);

	public ArrayList<Course> getCourses();

	public String saveCourse(CourseDto body);
}
