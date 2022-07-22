package org.exam.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.exam.feign.IActiveMQClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private IActiveMQClient activeMQClient;

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

    @GetMapping("showInfo/{time}")
    public String showInfo(@PathVariable Integer time) {
        return activeMQClient.showInfo(time);
    }
}
