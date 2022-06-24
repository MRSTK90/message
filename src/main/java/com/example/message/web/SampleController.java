package com.example.message.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @MessageMapping("/pub")
    public void publish(){

    }

}
