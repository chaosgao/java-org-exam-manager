package org.exam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("list")
    public List<String> list(){
        List<String> list = new ArrayList<>();

        list.add("AAA");
        list.add("BBB");

        return list;
    }

    @GetMapping("insert")
    public void insert(){

    }

    @GetMapping("update")
    public void update(){
        int i = 5 / 0;
    }
}
