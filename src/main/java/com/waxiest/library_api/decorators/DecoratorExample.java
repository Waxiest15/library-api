package com.waxiest.library_api.decorators;

import com.waxiest.library_api.interfaces.Book;


//First extend from BookDecorator
public class DecoratorExample extends BookDecorator {

    //May add some properties here (Optional)
    private double discount;

    //Attach a book instance
    public DecoratorExample(Book book) {
        super(book);
    }
    //Here you may want to add "Best Seller" to this book description/title
    @Override
    public String getResume() {
        return "Best Seller! " + decoratedBook.getResume();
    }

    //Or Maybe a discount
    @Override
    public double getPrice() {
        return decoratedBook.getPrice() * discount;
    }
}
