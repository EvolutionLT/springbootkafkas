package com.lt.kafka.controller;

import com.lt.kafka.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author evolution
 * @title: KafkaController
 * @projectName springbootkafka
 * @description: TODO
 * @date 2019-11-02 18:11
 */
@RestController
public class KafkaController {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @GetMapping("/message/send")
    public boolean send(@RequestParam String message){
        kafkaTemplate.send("testTopic",message);
        return true;
    }



        @PostMapping("/user/save")
        public boolean saveUser(@RequestBody User user){
            kafkaTemplate.send("userTopic",user);
            return true;

    }
}
