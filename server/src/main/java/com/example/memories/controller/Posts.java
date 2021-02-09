package com.example.memories.controller;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.example.memories.model.Post;
import com.example.memories.repository.PostRepository;



import java.util.List;
import java.util.Optional;



@RestController
@CrossOrigin(origins="*")
@RequestMapping(value = "/posts")
public class Posts {
	@Autowired
	private PostRepository postrepo;
	@CrossOrigin(origins="*")
	@GetMapping(value = "")
	public @ResponseBody List<Post> getPosts() {
		
		return postrepo.findAll(); 
		
	 }
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Post createPost(@RequestBody Post post) {
		
		
		
		return postrepo.save(post);
	}
	
	@RequestMapping(value = "", method = RequestMethod.PATCH)
	public @ResponseBody Post updatePost(@RequestBody Post post) {
		
		
		return postrepo.save(post);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String deletePost(@PathVariable String id) {
		 postrepo.deleteById(id);
		 final String msg = "Deleted";
		 return msg;
	}
	
	@RequestMapping(value = "/{id}/likePost", method = RequestMethod.PATCH)
	public @ResponseBody Post likePost(@PathVariable String id) {
		
		Optional<Post>  optionalposttoupdate = postrepo.findById(id);
		
		Post posttoupdate =  optionalposttoupdate.get();
		
		posttoupdate.setLikeCount(posttoupdate.getLikeCount() + 1);
		
	
		return postrepo.save(posttoupdate);
	}
	
}
