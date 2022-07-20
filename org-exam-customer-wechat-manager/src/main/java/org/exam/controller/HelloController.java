package org.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.exam.feign.ActiveMQClient;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private ActiveMQClient activeMQClient;

    @GetMapping("sendMessage")
    public void sendMessage(){
        activeMQClient.sendMessage();
    }

    @GetMapping("list")
    public String sendMessage1(){
        return activeMQClient.list();
    }

    @GetMapping("sendMessage2")
    public void sendMessage(String sendMessage){
        activeMQClient.sendMessage1(sendMessage);
    }

}
