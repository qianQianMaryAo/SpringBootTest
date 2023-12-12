package com.test;

import com.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    void contextLoads() {
        bookService.bookService();
    }

}
