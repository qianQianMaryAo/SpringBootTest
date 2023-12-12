package com.test;

import com.test.dao.BookDao;
import com.test.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }

}
