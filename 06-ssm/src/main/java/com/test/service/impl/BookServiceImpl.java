package com.test.service.impl;

import com.test.controller.Code;
import com.test.dao.BookDao;
import com.test.domain.Book;
import com.test.exception.BusinessException;
import com.test.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    //spring中未配置bookDao的bean（用的自动代理），所以没有bean给他自动装配
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        boolean flag;
        try {
            bookDao.save(book);
            flag = true;
        } catch (Exception e) {
            flag = false;
        }

        return flag;
    }

    public boolean delete(Integer id) {
        boolean flag;
        try {
            bookDao.delete(id);
            flag = true;
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public void update(Book book) {
        try {
            bookDao.update(book);
        } catch (Exception e) {
            throw new BusinessException(Code.BUSINESS_EXCEPTION_ERR, "错误");
        }
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
