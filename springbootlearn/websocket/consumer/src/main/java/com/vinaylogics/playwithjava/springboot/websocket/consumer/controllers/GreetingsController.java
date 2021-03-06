package com.vinaylogics.playwithjava.springboot.websocket.consumer.controllers;

import com.vinaylogics.playwithjava.springboot.websocket.consumer.models.GreetingsRequest;
import com.vinaylogics.playwithjava.springboot.websocket.consumer.models.GreetingsResponse;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class GreetingsController {

    private final RSocketRequester requester;

    GreetingsController(RSocketRequester requester){
        this.requester = requester;
    }

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE, value = "/greet/sse/{name}")
    Publisher<GreetingsResponse> greetStream(@PathVariable String name){
        return this.requester.route("greet-stream")
                .data(new GreetingsRequest(name))
                .retrieveFlux(GreetingsResponse.class);

    }


    @GetMapping("/greet/{name}")
    Publisher<GreetingsResponse> greet(@PathVariable String name){
        return this.requester.route("greet")
                .data(new GreetingsRequest(name))
                .retrieveMono(GreetingsResponse.class);

    }

    @GetMapping("/error")
    Publisher<GreetingsResponse> error(){
        return this.requester.route("error")
                .data(Mono.empty())
                .retrieveFlux(GreetingsResponse.class);
    }

}
