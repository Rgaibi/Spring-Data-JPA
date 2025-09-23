package com.springbootinitializr.API_data.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courserpository;

  

    public List<Course> getAllCourses(String topicId) {
    	List<Course> coursesFromDb =new ArrayList<>();
    	courserpository.findByTopicId(topicId)
    	.forEach(coursesFromDb::add);
    	
    	return coursesFromDb;
    }

    public Course getCourse(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    	return courserpository.findById(id).orElse(null);
    }


    public void addCourse(Course course) {
        //topics.add(topic);
    	courserpository.save(course);
    }

    public void updateCourse(Course course) {
    	courserpository.save(course);
    	

    }

    public void deleteCourse(String id) {
 
    	courserpository.deleteById(id);
    }
}
