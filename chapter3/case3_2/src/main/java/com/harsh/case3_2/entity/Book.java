package com.harsh.case3_2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Book {

    private Integer id;

    private String name;

    private String author;

}
