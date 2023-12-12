package com.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookDao {


    @GetMapping("/{id}")
    public String bookTest(@PathVariable Integer id) {
        System.out.println("id=====" + id);
        System.out.println("====================");

        return "success";
    }
}
