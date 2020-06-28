package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;

public class IndiaCarFactory {

    static Car buildCar(Car.CarType model){
        Car car;
        switch (model) {
            case MICRO:
                car = new MicroCar(Car.Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Car.Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Car.Location.INDIA);
                break;
            default:
                throw new FactoryExceptions("Invalid Object Selected");
        }
        return car;
    }
}
