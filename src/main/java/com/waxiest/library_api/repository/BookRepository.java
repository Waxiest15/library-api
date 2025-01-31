package com.waxiest.library_api.repository;

import com.waxiest.library_api.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<BookModel, Long> {
}
