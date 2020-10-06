package com.vinaylogics.playwithjava.designpatterns.structural.bridge;

public class Produce implements WorkShop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
