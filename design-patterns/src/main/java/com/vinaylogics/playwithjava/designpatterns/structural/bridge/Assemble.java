package com.vinaylogics.playwithjava.designpatterns.structural.bridge;

public class Assemble implements WorkShop {
    @Override
    public void work() {
        System.out.println(" And");
        System.out.println(" Assembled.");
    }
}
