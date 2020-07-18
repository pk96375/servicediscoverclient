package com.service.request.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalog.model.MovieCatalog;

@RestController
public class RestTemplateController {

	@Autowired
	RestTemplate template;

	@GetMapping("/getmovies")
	public List<MovieCatalog> getMovieCatalog() {
		List<MovieCatalog> movieCatalogs = (List<MovieCatalog>) template
				.getForObject("http://catalogservice/moviecatalog/allmovies", List.class);
		return movieCatalogs;
	}
}
