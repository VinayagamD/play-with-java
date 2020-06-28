package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

public class MiniCar extends Car {

    MiniCar(Location location){
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {

    }
}
