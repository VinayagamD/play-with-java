package com.vinaylogics.playwithjava.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

class PrototypeTest {

    @Test
    public void testColorPrototype(){
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("blue").addColor();
    }

}