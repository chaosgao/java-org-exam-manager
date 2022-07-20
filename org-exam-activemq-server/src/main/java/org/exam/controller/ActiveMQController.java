package org.exam.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "消息")
@RestController
@RequestMapping("activemq")
public class ActiveMQController {

    public static final String 我爱北京天安门 = "我爱北京天安门！";
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @ApiOperation(value = "发送字符串",notes = "给消息队列【gaochao】发送内容")
    @GetMapping("sendMessage/{message}")
    public void sendMessage(@PathVariable String message){
        jmsMessagingTemplate.convertAndSend("gaochao",message);
    }

    @ApiOperation(value = "发送字符串",notes = "给消息队列【gaochao】发送内容")
    @GetMapping("sendMessage2")
    public void sendMessage2(){
        jmsMessagingTemplate.convertAndSend("gaochao","我爱北京天安门");
    }
}

