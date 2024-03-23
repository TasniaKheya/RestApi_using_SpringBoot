package com.springrest.springrest.services;
import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course addCourse);
	public Course updateCourse(Course updateCourse);
	public Course delCourse(long courseId);
}
