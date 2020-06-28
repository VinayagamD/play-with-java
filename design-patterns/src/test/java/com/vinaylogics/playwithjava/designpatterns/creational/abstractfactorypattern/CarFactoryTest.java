package com.vinaylogics.playwithjava.designpatterns.creational.abstractfactorypattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("To Test Abstract factory pattern")
class CarFactoryTest {

    @DisplayName("To Test Car for Mini type  created")
    @ParameterizedTest(name = "{index} => location=''{0}''")
    @EnumSource(value = Car.Location.class, names = {"INDIA", "USA", "DEFAULT"}, mode = EnumSource.Mode.MATCH_ANY)
    public void testBuildCar_Mini(Car.Location location){
        Car car = CarFactory.buildCard(location, Car.CarType.MINI);
        assertEquals(car.getModel(), Car.CarType.MINI);
        assertEquals(car.getLocation(), location);
        assertTrue(car instanceof MiniCar);
    }

    @DisplayName("To Test Car for Micro type  created")
    @ParameterizedTest(name = "{index} => location=''{0}''")
    @EnumSource(value = Car.Location.class, names = {"INDIA", "USA", "DEFAULT"}, mode = EnumSource.Mode.MATCH_ANY)
    public void testBuildCar_Micro(Car.Location location){
        Car car = CarFactory.buildCard(location, Car.CarType.MICRO);
        assertEquals(car.getModel(), Car.CarType.MICRO);
        assertEquals(car.getLocation(), location);
        assertTrue(car instanceof MicroCar);
    }

    @DisplayName("To Test Car for Luxury type  created")
    @ParameterizedTest(name = "{index} => location=''{0}''")
    @EnumSource(value = Car.Location.class, names = {"INDIA", "USA", "DEFAULT"}, mode = EnumSource.Mode.MATCH_ANY)
    public void testBuildCar_Luxury(Car.Location location){
        Car car = CarFactory.buildCard(location, Car.CarType.LUXURY);
        assertEquals(car.getModel(), Car.CarType.LUXURY);
        assertEquals(car.getLocation(), location);
        assertTrue(car instanceof LuxuryCar);
    }




}