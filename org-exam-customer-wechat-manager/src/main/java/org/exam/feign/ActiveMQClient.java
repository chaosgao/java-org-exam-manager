package org.exam.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("org-exam-activemq-server")
public interface ActiveMQClient {

    @GetMapping("activemq/sendMessage2")
    void sendMessage();

    @GetMapping("activemq/sendMessage/{sendMessage}")
    void sendMessage1(@PathVariable String sendMessage);

    @GetMapping("hello/list")
    String list();

}
