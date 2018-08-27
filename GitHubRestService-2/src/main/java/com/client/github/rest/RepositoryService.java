package com.client.github.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.client.github.model.Repository;

@RestController
@RequestMapping("https://api.github.com")
public class RepositoryService {

	
	
	@GetMapping("/users/{username}/repos")
	public ResponseEntity<Repository> getAllRepositoryByUser(@PathVariable("username") String username)
	{
		//Repository repo=new Repository();
		return new ResponseEntity<Repository>(HttpStatus.ACCEPTED);
	}
}
