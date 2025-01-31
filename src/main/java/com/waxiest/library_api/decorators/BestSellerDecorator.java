package com.waxiest.library_api.decorators;

import com.waxiest.library_api.interfaces.Book;

public class BestSellerDecorator extends BookDecorator{

    public BestSellerDecorator(Book book) {
        super(book);
    }

    @Override
    public String getResume() {
        return "Best Seller! " + decoratedBook.getResume();
    }
}
