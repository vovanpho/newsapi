package app.web.newsapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.web.newsapi.dto.ArticleDto;
import app.web.newsapi.service.impl.ArticleService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1/everything")
public class ArticleController {
	
	@Autowired private ArticleService articleService; 
	
	@PostMapping()
	public String postMethodName(@RequestBody ArticleDto dto) {
		//TODO: process POST request
		articleService.save(dto);
		return "complete";
	}

	
}
