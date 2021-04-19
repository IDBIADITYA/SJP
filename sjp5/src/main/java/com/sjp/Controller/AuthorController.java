package com.sjp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjp.Model.Author;
import com.sjp.Repository.AuthorRepository;

@RestController
@RequestMapping("/api/v1")
public class AuthorController {
	@Autowired
	private AuthorRepository authorrepository;
	
	@GetMapping("/Author")
	public List<Author>getAllAuthor()
	{
		return authorrepository.findAll();
	}
	
	

}
