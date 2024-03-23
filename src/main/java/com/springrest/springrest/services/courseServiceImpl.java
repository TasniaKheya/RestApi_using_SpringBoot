package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class courseServiceImpl implements CourseService {
	
	List<Course>list;
	
	public courseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(1,"JAVA","This is a basic Java course"));
		list.add(new Course(2,"Spring","This is a basic Spring course"));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c= null;
		for(Course course:list)
		{
			if(course.getId() == courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course addCourse) {
		// TODO Auto-generated method stub
		for(Course course:list)
		{
			if(course.getId() == addCourse.getId())
			{
				return addCourse;
			}
			
		}
		list.add(addCourse);
		return addCourse;
	}
	@Override
	public Course updateCourse(Course updateCourse) {
		// TODO Auto-generated method stub
		for(Course course:list)
		{
			if(course.getId() == updateCourse.getId())
			{
				long l = course.getId();
				int c = (int)l;
				list.set(c-1, updateCourse);
				break;
			}
		}
		return updateCourse;
	}
	@Override
	public Course delCourse(long courseId) {
		// TODO Auto-generated method stub
		
		Course  c1 = null;
		for(Course course:list)
		{
			if(course.getId() == courseId)
			{
				long l = course.getId();
				int c = (int)l;
				list.remove(c-1);
				break;
			}
		}
		return c1;
	}

}
