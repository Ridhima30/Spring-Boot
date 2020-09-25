package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//getAll topics
	//Get topic given id
	//update topic
	//delete topic
}
