package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

import com.vinaylogics.playwithjava.designpatterns.creational.exceptions.FactoryExceptions;

public class CarFactory {

    private CarFactory(){}

    public static Car buildCard(Car.Location location, Car.CarType type){
        Car car;
        switch (location){
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(type);
                break;
            default:
                throw new FactoryExceptions("Invalid Option Selected");
        }
        return car;
    }
}
