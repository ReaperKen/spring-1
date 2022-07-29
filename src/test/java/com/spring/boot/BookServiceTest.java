package com.spring.boot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void priceTest() {

        //Configurar el test
        Book book = new Book(10L, "Ken", "Ken Agudelo", "30");
        BookService bookService = new BookService();

        //Configurando el comportamiento a testear
        Double price = bookService.price(book);
        System.out.println(price);

        //Comprobaciones
        assertTrue(price > 0);
    }
}