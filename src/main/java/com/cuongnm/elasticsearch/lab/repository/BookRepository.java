package com.cuongnm.elasticsearch.lab.repository;

import com.cuongnm.elasticsearch.lab.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {
    Page<Book> findByAuthor(String author, Pageable pageable);

    List<Book> findByTitle(String title);
}
