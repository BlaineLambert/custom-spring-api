package com.blaine.learning.controllers;

import com.blaine.learning.entities.Person;
import com.blaine.learning.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService ps;

    @GetMapping("/people")
    public List<Person> getAll(){
        return ps.getAll();
    }
}
