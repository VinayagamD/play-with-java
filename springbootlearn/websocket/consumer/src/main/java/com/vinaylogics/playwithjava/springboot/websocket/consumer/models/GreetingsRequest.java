package com.vinaylogics.playwithjava.springboot.websocket.consumer.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GreetingsRequest {

    private String name;
}
