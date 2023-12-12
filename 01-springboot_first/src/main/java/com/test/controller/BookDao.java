package com.test.controller;

import com.test.pojo.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookDao {
    //直接读取
    @Value("${lesson}")
    private String lesson;
    @Value("${server.port}")
    private String server;
    @Value("${Enterprise.subject[0]}")
    private String enterprise_00;
    //封装后读取
    @Autowired
    private Environment environment;
    //实体类封装属性
    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{id}")
    public String bookTest(@PathVariable Integer id) {
        System.out.println("id=====" + id);
        System.out.println("====================");
        System.out.println(lesson);
        System.out.println(server);
        System.out.println(enterprise_00);
        System.out.println("=======================");
        System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("Enterprise.subject[0]"));
        System.out.println(environment.getProperty("Enterprise.age"));
        System.out.println("===========================");
        System.out.println(enterprise.getAge());
        System.out.println(enterprise.getName());
        System.out.println(enterprise);

        return "success";
    }
}
