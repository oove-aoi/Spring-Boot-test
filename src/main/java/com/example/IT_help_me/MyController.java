package com.example.IT_help_me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MyController {

    /*
    @Autowired
    @Qualifier("hpPrinter")
    private Printer printer;
    */

    @RequestMapping("/test")
    public String test() {
        System.out.println("Hi!");
        return "Hello World";
    }

    @RequestMapping("/test1")
    public String test1(@RequestParam Integer id) {
        return "ID:" + id;
    }

    @RequestMapping("/test2")
    public Student test2(@RequestBody Student student) {
        return student;
    }

    @RequestMapping("/user")
    public Student user() {
        Student student = new Student();
        student.setName("小明");
        return student;
    }
    @RequestMapping("/product")
    public Store product(){
        Store store = new Store();
        List<String> list = new ArrayList<>();
        list.add("蘋果");
        list.add("橘子");
        store.setProductList(list);
        return store;
    }

}
