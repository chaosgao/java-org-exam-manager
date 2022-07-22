package org.exam.feign;

import org.exam.feign.impl.ActiveMQFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "org-exam-activemq-server",fallback = ActiveMQFeignImpl.class)
public interface IActiveMQClient {

    @GetMapping("activemq/sendMessage2")
    void sendMessage();

    @GetMapping("activemq/sendMessage/{sendMessage}")
    void sendMessage1(@PathVariable String sendMessage);

    @GetMapping("hello/list")
    String list();

    @GetMapping("hello/showInfo/{time}")
    String showInfo(@PathVariable Integer time);

}
