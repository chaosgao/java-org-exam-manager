package org.exam.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("port")
    public String port(){
        return "端口号"+port;
    }

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

    @GetMapping("showInfo/{time}")
    public String showInfo(@PathVariable Integer time){
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我爱北京天安门！"+ time+"S";
    }
}
