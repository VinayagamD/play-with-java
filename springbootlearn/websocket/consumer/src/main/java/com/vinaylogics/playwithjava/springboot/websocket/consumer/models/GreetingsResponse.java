package com.vinaylogics.playwithjava.springboot.websocket.consumer.models;

import lombok.Data;

import java.time.Instant;

@Data
public class GreetingsResponse {

    public GreetingsResponse(){ }

    public GreetingsResponse(String name){
        this.withGreeting("Hello "+name+ " @ "+ Instant.now());
    }

    GreetingsResponse withGreeting(String msg){
        this.greeting = msg;
        return this;
    }

    private String greeting;
}
