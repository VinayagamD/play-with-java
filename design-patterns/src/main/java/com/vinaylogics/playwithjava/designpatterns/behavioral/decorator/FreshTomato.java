package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

public class FreshTomato extends ToppingDecorator {
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Fresh Tomato";
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost();
    }
}
