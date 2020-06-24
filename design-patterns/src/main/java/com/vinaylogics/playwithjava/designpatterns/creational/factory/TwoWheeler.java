package com.vinaylogics.playwithjava.designpatterns.creational.factory;

public class TwoWheeler implements Vehicle {

    TwoWheeler() {
    }

    @Override
    public String getVehicle() {
        return "I am two wheeler";
    }
}
