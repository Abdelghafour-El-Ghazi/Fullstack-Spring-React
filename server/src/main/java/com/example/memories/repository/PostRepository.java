package com.example.memories.repository;

import com.example.memories.model.Post;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository  extends MongoRepository<Post,String> {
	

}
