package com.waxiest.library_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.waxiest.library_api.enums.BookFormat;
import com.waxiest.library_api.interfaces.Book;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Books")
@Data
@ToString

public class BookModel implements Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;


    private Set<String> authors;

    @Column(unique = true, nullable = false)
    private String isbn;

    private String publisher;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;  // Date when the book was published

    private Set<String> genres;

    private int numberOfPages;

    private String language;

    @Enumerated(EnumType.STRING)
    private BookFormat format;

    private double price;

    private double rating;

    private String description;

    @Override
    public String getResume() {
        return title + " by " + authors.toString() + "\n" + description;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
