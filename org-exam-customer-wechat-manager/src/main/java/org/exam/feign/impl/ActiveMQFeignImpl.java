package org.exam.feign.impl;

import org.exam.feign.IActiveMQClient;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQFeignImpl implements IActiveMQClient {

    @Override
    public void sendMessage() {

    }

    @Override
    public void sendMessage1(String sendMessage) {

    }

    @Override
    public String list() {
        return "服务请求超时。";
    }

    @Override
    public String showInfo(Integer time) {
        return "服务请求超时，接收参数为："+time;
    }
}
