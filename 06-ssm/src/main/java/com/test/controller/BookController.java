package com.test.controller;

import com.test.domain.Book;
import com.test.service.BookService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR, flag);
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean delete = bookService.delete(id);
        return new Result(delete?Code.DELETE_OK:Code.SAVE_ERR,delete);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        bookService.update(book);
        return new Result(Code.UPDATE_OK,null);
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code=book!=null?Code.SELECT_OK:Code.SELECT_ERR;
        String msg=book!=null?"成功":"错误请重试";
        return new Result(code,book,msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();
        Integer code=bookList!=null?Code.SELECT_OK:Code.SELECT_ERR;
        String msg=bookList!=null?"成功":"错误请重试";
        return new Result(code,bookList,msg);

    }
}
