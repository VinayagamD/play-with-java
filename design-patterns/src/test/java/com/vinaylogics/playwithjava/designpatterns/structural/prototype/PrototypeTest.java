package com.vinaylogics.playwithjava.designpatterns.structural.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    public void testColorPrototype(){
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }

}