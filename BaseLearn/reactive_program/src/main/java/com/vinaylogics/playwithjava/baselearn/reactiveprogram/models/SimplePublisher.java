package com.vinaylogics.playwithjava.baselearn.reactiveprogram.models;

import java.util.Iterator;
import java.util.concurrent.Flow;
import java.util.stream.IntStream;

public class SimplePublisher implements Flow.Publisher<Integer>{

    private final Iterator<Integer> iterator;

    public SimplePublisher(int count) {
        this.iterator = IntStream.range(1,count).iterator();
    }

    @Override
    public void subscribe(Flow.Subscriber<? super Integer> subscriber) {
        iterator.forEachRemaining(subscriber::onNext);
        subscriber.onComplete();
    }
}
