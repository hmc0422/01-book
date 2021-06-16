package com.harsh.case3_2.controller;

import com.harsh.case3_2.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book b1 = Book.builder().id(1).name("红楼梦").author("曹雪芹").build();
        Book b2 = Book.builder().id(2).name("三国演义").author("罗贯中").build();
        books.add(b1);
        books.add(b2);

        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }

}
