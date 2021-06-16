package com.harsh.case4_1.controller;

import com.harsh.case4_1.entity.GsonBook;
import com.harsh.case4_1.entity.JacksonDataBindBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {

    @GetMapping("/jacksonDataBindBook")
    public JacksonDataBindBook jacksonDataBindBook() {
        return JacksonDataBindBook.builder().name("三国演义").author("罗贯中").price(30f).publicationDate(new Date()).build();
    }

    @GetMapping("/gsonBook")
    public GsonBook gsonBook() {
        return GsonBook.builder().name("三国演义").author("罗贯中").price(30f).publicationDate(new Date()).build();
    }

    @GetMapping("/fastjsonBook")
    public GsonBook fastjsonBook() {
        return GsonBook.builder().name("三国演义").author("罗贯中").price(30f).publicationDate(new Date()).build();
    }


}
