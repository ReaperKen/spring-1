package com.spring.boot;

public class BookService {

    public double price(Book book){
        return Double.parseDouble(book.getPrice()) + 2.19d;
    }
}
