package com.vinaylogics.multithreading.concurrenthread.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorThreadPoolDemo {

    public static void main(String[] args) {
        // Create the pool
        ExecutorService service = Executors.newFixedThreadPool(10);

        // submit the tasks for execution
        IntStream.range(0, 10).forEach(i -> {
            service.execute(new Task());
        });

        service.shutdown();
        System.out.println("Thread Name: "+ Thread.currentThread().getName());
    }

    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("Thread Name: "+Thread.currentThread().getName());
        }
    }
}
