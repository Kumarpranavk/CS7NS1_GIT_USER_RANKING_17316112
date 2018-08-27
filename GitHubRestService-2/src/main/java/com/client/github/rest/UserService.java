package com.client.github.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.github.model.Repository;
import com.client.github.model.User;

@RestController
@RequestMapping("https://api.github.com")
public class UserService {
	
	@GetMapping("/user/{login}")
	public ResponseEntity<User> getUserByUsername(String login) {
		return new ResponseEntity<User>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users/{login}")
	public ResponseEntity<List<User>> getAllUsers(String login) {
		return new ResponseEntity<List<User>>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/users/{login}/followers")
	public ResponseEntity<List<User>> getAllFollowers(String login) {
		return new ResponseEntity<List<User>>(HttpStatus.ACCEPTED);
	}
}
