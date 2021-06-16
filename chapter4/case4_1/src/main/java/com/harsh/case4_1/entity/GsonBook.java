package com.harsh.case4_1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class GsonBook {

    private String name;

    private String author;

    // Gson使用protected进行排除
    protected Float price;

    private Date publicationDate;

}
