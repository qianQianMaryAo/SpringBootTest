package com.test1;

import com.test.Application;
import com.test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
class ApplicationTests {

    @Autowired
    private BookService bookService;
    @Test
    void contextLoads() {
        bookService.bookService();
    }

}
