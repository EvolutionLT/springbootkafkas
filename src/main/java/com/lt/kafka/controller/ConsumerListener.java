package com.lt.kafka.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author evolution
 * @title: ConsumerListener
 * @projectName springbootkafka
 * @description: TODO
 * @date 2019-11-02 18:19
 * @ltd：思为
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "testTopic")
    public void onMessage(String message){
        //insertIntoDb(buffer);//这里为插入数据库代码
        System.out.println(message);
    }
}
