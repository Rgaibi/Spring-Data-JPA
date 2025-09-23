package com.springbootinitializr.API_data.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository; 

//JpaRepository Hérite de CrudRepository et ajoute des fonctionnalités spécifiques à JPA/Hibernate
public interface CourseRepository extends CrudRepository<Course, String> {
	List<Course> findByTopicId(String topicId);
		
}
