package com.blaine.learning.services;

import com.blaine.learning.entities.PersonMovies;
import com.blaine.learning.repos.PersonMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonMoviesService {
    @Autowired
    private PersonMoviesRepository pms;

    public List<PersonMovies> getAll(){ return pms.findAll();
    }
}
