package com.waxiest.library_api;

import com.waxiest.library_api.model.BookModel;
import com.waxiest.library_api.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CLRunner implements CommandLineRunner {

    private final BookRepository bookRepository;

    public CLRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<BookModel> books = this.bookRepository.findAll();
        books.forEach(book -> {
                    System.out.println(book.getResume());
                }
        );

    }
}
