package com.cuongnm.elasticsearch.lab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@Document(indexName = "elasticsearch-lab")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;
}
