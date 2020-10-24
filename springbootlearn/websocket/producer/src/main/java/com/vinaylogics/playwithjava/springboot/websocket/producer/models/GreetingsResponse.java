package com.vinaylogics.playwithjava.springboot.websocket.producer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
public class GreetingsResponse {

    public GreetingsResponse(){ }

    public GreetingsResponse(String name){
        this.withGreeting("Hello "+name+ " @ "+ Instant.now());
    }

    public GreetingsResponse withGreeting(String msg){
        this.greeting = msg;
        return this;
    }

    private String greeting;
}
