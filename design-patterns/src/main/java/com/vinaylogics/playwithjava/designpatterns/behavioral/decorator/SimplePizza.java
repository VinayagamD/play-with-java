package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

public class SimplePizza extends Pizza {

    public SimplePizza() {
        description = "SimplePizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
