package com.springbootinitializr.API_data.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseepository;

  

    public List<Course> getAllCourses() {
    	List<Course> coursesFromDb =new ArrayList<>();
    	courseepository.findAll().forEach(coursesFromDb::add);
    	
    	return coursesFromDb;
    }

    public Course getCourse(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    	return courseepository.findById(id).orElse(null);
    }


    public void addCourse(Course course) {
        //topics.add(topic);
    	courseepository.save(course);
    }

    public void updateCourse(Course course) {
    	courseepository.save(course);
    	

    }

    public void deleteCourse(String id) {
 
    	courseepository.deleteById(id);
    }
}
