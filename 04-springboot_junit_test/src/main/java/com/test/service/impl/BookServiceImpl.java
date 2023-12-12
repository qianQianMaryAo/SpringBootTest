package com.test.service.impl;

import com.test.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void bookService() {
        System.out.println("service....");
    }
}
