package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

public class Barbeque extends ToppingDecorator {

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Barbeque ";
    }

    @Override
    public int getCost() {
        return 90+ pizza.getCost();
    }
}
