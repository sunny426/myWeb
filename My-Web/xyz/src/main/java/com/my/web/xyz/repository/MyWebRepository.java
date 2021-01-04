package com.my.web.xyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.web.xyz.model.Course;

public interface MyWebRepository extends JpaRepository<Course, Integer>{

	public Course findByCourseId(int courseId);
}
