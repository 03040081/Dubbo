package com.zzc.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.zzc.dubbo.consumer.quickstart.QucikstartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);

        QucikstartConsumer qucikstartConsumer = (QucikstartConsumer) run.getBean("qucikstartConsumer");

        qucikstartConsumer.sendMessage("奥利力大苏打撒旦");

    }

}
