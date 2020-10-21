package com.vinaylogics.playwithjava.designpatterns.creational.builder;

public class IglooHouseBuilder implements HouseBuilder {

    private House house;

    public IglooHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
