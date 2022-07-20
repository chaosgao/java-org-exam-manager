package org.exam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConsumerMQ {

    @JmsListener(destination = "gaochao")
    public void handleMessage(String name){
            System.out.println(name);
        }
    }

