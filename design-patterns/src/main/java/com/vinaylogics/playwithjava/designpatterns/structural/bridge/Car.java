package com.vinaylogics.playwithjava.designpatterns.structural.bridge;

public class Car extends Vehicle{
    public Car(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car ");
        workShop1.work();
        workShop2.work();
    }
}
