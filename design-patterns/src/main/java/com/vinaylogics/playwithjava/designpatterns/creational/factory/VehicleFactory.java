package com.vinaylogics.playwithjava.designpatterns.creational.factory;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;

public class VehicleFactory {

    public static final VehicleFactory INSTANCE = new VehicleFactory();

    private VehicleFactory(){

    }

    public Vehicle create(Vehicle.VehicleType type){
        Vehicle vehicle;
        if(type == null){
            throw new FactoryExceptions("Type Cannot be null");
        }
        switch (type){
            case TWO_WHEELER:
                vehicle = new TwoWheeler();
                break;
            case THREE_WHEELER:
                vehicle = new ThreeWheeler();
                break;
            case FOUR_WHEELER:
                vehicle = new FourWheeler();
                break;
            default:
                throw new FactoryExceptions("Invalid Vehicle");
        }

        return vehicle;
    }

}
