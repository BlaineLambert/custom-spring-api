package com.blaine.learning.services;

import com.blaine.learning.entities.Book;
import com.blaine.learning.entities.Movie;
import com.blaine.learning.repos.BookRepository;
import com.blaine.learning.repos.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bs;

    public List<Book> getAll(){
        return bs.findAll();
    }
}
