package com.example.IT_help_me;

import org.springframework.web.bind.annotation.*;
@RestController
public class StudentController {
    @PostMapping("/students")
    public String create(@RequestBody Student student) {

        return "執行資料庫的Create操作";
    }

    @GetMapping("/students/{studentsId}")
    public String read(@PathVariable Integer studentsId) {

        return "執行資料庫的Get操作";
    }

    @PutMapping("/students/{studentsId}")
    public String update(@PathVariable Integer studentsId,
                         @RequestBody Student student) {
        return "執行資料庫的Update操作";
    }

    @DeleteMapping("/students/{studentsId}")
    public String delete(@PathVariable Integer studentsId) {
        return  "執行資料庫的Delete操作";
    }
}
