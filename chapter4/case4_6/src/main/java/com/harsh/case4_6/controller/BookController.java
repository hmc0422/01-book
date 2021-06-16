package com.harsh.case4_6.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    /**
     * value : 支持的域
     * maxAge：探测请求的有效期
     * allowedHeaders：允许的请求头
     *
     * @param name
     * @return
     */
    @PostMapping("/")
    // @CrossOrigin(value = "http://localhost:8081", maxAge = 1800, allowedHeaders = "*")
    public String addBook(String name) {
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
    // @CrossOrigin(value = "http://localhost:8081", maxAge = 1800, allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id) {
        return String.valueOf(id);
    }

}
