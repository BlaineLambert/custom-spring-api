package com.blaine.learning.services;

import com.blaine.learning.entities.Movie;
import com.blaine.learning.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository ms;

    public List<Movie> getAll(){
        return ms.findAll();
    }
}
