package com.vinaylogics.playwithjava.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

class BirdAdapterTest {

    @Test
    public void testAdapterBehaviour(){
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        BirdAdapter birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}