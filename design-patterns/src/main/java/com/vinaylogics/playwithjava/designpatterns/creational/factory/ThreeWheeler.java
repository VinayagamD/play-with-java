package com.vinaylogics.playwithjava.designpatterns.creational.factory;

public class ThreeWheeler implements Vehicle {

    ThreeWheeler() {
    }

    @Override
    public String getVehicle() {
        return "I am three wheeler";
    }
}
