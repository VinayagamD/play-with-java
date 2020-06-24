package com.vinaylogics.playwithjava.designpatterns.creational.factory;

public interface Vehicle {

    String getVehicle();

    enum VehicleType {
        TWO_WHEELER, THREE_WHEELER, FOUR_WHEELER
    }
}
