package com.spring.boot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Book>> getAll() {
        return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    public Book create(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Book> getOne(@PathVariable Long id){

        Book book = bookRepository.findById(id).orElse(null);

        if(book == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(book, HttpStatus.OK);
    }



}
