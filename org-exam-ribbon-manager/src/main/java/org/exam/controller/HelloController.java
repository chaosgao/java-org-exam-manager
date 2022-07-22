package org.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("hello")
    public String list() {
        return restTemplate.getForObject("http://org-exam-activemq-server/hello/port", String.class);
    }

}
