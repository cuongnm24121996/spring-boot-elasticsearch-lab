package com.cuongnm.elasticsearch.lab;

import com.cuongnm.elasticsearch.lab.entity.Book;
import com.cuongnm.elasticsearch.lab.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@AllArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookService.save(new Book("1001", "Elasticsearch Basics", "Rambabu Posa", "23-FEB-2017"));
        bookService.save(new Book("1002", "Apache Lucene Basics", "Rambabu Posa", "13-MAR-2017"));
        bookService.save(new Book("1003", "Apache Solr Basics", "Rambabu Posa", "21-MAR-2017"));

        Page<Book> books = bookService.findByAuthor("Rambabu", PageRequest.of(0, 3));

        books.forEach(x -> System.out.println(x));
    }

}
