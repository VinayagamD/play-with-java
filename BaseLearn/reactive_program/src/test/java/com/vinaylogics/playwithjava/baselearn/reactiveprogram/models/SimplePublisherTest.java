package com.vinaylogics.playwithjava.baselearn.reactiveprogram.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.*;

class SimplePublisherTest {

    private SimplePublisher simplePublisher;

    @BeforeEach
    public void setUp(){
        simplePublisher = new SimplePublisher(10);
    }

    @Test
    void subscribe() {
        simplePublisher.subscribe(new Flow.Subscriber<Integer>(){

            @Override
            public void onSubscribe(Flow.Subscription subscription) {

            }

            @Override
            public void onNext(Integer item) {
                System.out.println("item = ["+item+"]");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("throwable = ["+throwable+"]");
            }

            @Override
            public void onComplete() {
                System.out.println("complete");
            }
        });
    }
}