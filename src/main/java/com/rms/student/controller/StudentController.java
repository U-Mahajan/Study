package com.rms.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    @GetMapping("/add")
    public String sdd() {
        System.out.println("ffff");
        return "umesh";
    }
}
