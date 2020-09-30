package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

public class Paneer extends ToppingDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }
}
