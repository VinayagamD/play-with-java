package com.vinaylogics.playwithjava.designpatterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
