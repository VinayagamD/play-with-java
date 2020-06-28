package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;

public class USACarFactory {

    static Car buildCar(Car.CarType model){
        Car car;
        switch (model) {
            case MICRO:
                car = new MicroCar(Car.Location.USA);
                break;
            case MINI:
                car = new MiniCar(Car.Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Car.Location.USA);
                break;
            default:
                throw new FactoryExceptions("Invalid Object Selected");
        }
        return car;
    }
}
