package com.blaine.learning.controllers;

import com.blaine.learning.entities.PersonMovies;
import com.blaine.learning.services.PersonMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class PersonMovieController {
    @Autowired
    private PersonMoviesService pms;

    @GetMapping("/peoplesmovies")
    public List<PersonMovies> getAll(){ return pms.getAll(); }
}
