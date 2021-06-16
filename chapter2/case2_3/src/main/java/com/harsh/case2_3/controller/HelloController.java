package com.harsh.case2_3.controller;

import com.harsh.case2_3.config.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Book book;

    @GetMapping("/hello")
    public String Hello() {
        return "hello spring boot";
    }

    @GetMapping("/book")
    public String BookController() {
        return book.toString();
    }
}
