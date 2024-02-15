package com.blaine.learning.services;

import com.blaine.learning.entities.PersonBooks;
import com.blaine.learning.repos.PersonBooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonBooksService {
    @Autowired
    private PersonBooksRepository pbs;

    public List<PersonBooks> getAll(){ return pbs.findAll();
    }
}
