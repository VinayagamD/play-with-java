package com.vinaylogics.playwithjava.designpatterns.creational.builder;

public interface HouseBuilder {

    void buildBasement();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}
