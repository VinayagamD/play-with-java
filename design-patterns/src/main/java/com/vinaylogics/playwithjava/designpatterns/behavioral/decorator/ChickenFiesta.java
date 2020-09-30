package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

public class ChickenFiesta extends Pizza{

    public ChickenFiesta() {
        description = "ChickenFiesta";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
