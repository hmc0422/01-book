package com.harsh.case4_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Case410Application {

    public static void main(String[] args) {
        SpringApplication.run(Case410Application.class, args);
    }

}
