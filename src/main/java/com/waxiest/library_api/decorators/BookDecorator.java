package com.waxiest.library_api.decorators;

import com.waxiest.library_api.interfaces.Book;

public abstract class BookDecorator implements Book {
    protected Book decoratedBook;

    public BookDecorator(Book book){
        this.decoratedBook = book;
    }

    @Override
    public String getResume() {
        return decoratedBook.getResume();
    }

    @Override
    public double getPrice() {
        return decoratedBook.getPrice();
    }
}
