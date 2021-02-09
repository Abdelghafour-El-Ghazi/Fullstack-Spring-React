package com.example.memories.model;

import java.util.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Posts")
public class Post {
	
	
	private String _id;
	private String title;
    private String message;
    private String creator;
    private String[] tags;
    private String selectedFile;
    private Integer likeCount=0;
    private Date createdAt= new Date();
    
    
  
    
    
    
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getSelectedFile() {
		return selectedFile;
	}
	public void setSelectedFile(String selectedFile) {
		this.selectedFile = selectedFile;
	}
	public Integer getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(Integer likeCount) {
		this.likeCount = likeCount;
	}
    
    
    
    
}
