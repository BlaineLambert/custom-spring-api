package com.blaine.learning.services;

import com.blaine.learning.entities.Person;
import com.blaine.learning.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository pr;

    public List<Person> getAll(){
        return pr.findAll();
    }
}
