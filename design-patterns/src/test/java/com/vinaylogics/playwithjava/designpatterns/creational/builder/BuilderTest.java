package com.vinaylogics.playwithjava.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    public void testBuilder(){
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder Constructed: "+ house);
    }
}