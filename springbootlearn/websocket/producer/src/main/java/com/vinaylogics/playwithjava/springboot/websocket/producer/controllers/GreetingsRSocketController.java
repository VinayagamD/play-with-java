package com.vinaylogics.playwithjava.springboot.websocket.producer.controllers;


import com.vinaylogics.playwithjava.springboot.websocket.producer.models.GreetingsRequest;
import com.vinaylogics.playwithjava.springboot.websocket.producer.models.GreetingsResponse;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.function.Supplier;
import java.util.stream.Stream;

@Controller
public class GreetingsRSocketController {

    @MessageMapping("error")
    Flux<GreetingsResponse> error(){
        return Flux.error(new IllegalArgumentException());
    }

    @MessageExceptionHandler
    Flux<GreetingsResponse> errorHandler(IllegalArgumentException iae){
        return Flux.just(new GreetingsResponse().withGreeting("OH NO!"));
    }

    @MessageMapping("greet-stream")
    Flux<GreetingsResponse> greetStream(GreetingsRequest request){
        return Flux.fromStream(Stream.generate(() -> new GreetingsResponse(request.getName()))).delayElements(Duration.ofSeconds(1));
    }

    @MessageMapping("greet")
    GreetingsResponse greet(GreetingsRequest request) {
        return new GreetingsResponse(request.getName());
    }
}
