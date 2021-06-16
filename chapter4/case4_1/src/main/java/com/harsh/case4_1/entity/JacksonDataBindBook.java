package com.harsh.case4_1.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class JacksonDataBindBook {

    private String name;

    private String author;

    @JsonIgnore
    private Float price;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
}
