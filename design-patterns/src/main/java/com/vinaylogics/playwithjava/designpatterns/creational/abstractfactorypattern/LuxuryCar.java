package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

public class LuxuryCar extends Car{

    LuxuryCar(Location location){
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to luxury car");
    }

}
