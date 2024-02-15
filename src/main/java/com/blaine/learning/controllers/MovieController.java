package com.blaine.learning.controllers;

import com.blaine.learning.entities.Movie;
import com.blaine.learning.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    private MovieService ms;

    @GetMapping("/movie")
    public List<Movie> getAll(){
        return ms.getAll();
    }
}
