package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

public class MicroCar extends Car {

    MicroCar(Location location){
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to Micro Car");
    }
}
