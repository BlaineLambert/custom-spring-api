package com.blaine.learning.controllers;

import com.blaine.learning.entities.Book;
import com.blaine.learning.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService bs;

    @GetMapping("/book")
    public List<Book> getAll(){
        return bs.getAll();
    }
}
