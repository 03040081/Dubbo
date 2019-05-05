package com.zzc.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.common.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QucikstartConsumer {

    @Reference(url = "dubbo://127.0.0.1:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
