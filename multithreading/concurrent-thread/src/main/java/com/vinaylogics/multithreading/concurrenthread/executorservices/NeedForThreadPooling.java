package com.vinaylogics.multithreading.concurrenthread.executorservices;

import java.util.stream.IntStream;

public class NeedForThreadPooling {

    public static void main(String[] args) {
        IntStream.range(0,10).forEach(i ->{
            Thread thread = new Thread(new Task());
            thread.start();
        });
        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }

    static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread Name: "+ Thread.currentThread().getName());
        }
    }
}
