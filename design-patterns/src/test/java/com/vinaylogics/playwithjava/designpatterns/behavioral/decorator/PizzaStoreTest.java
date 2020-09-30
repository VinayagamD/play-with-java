package com.vinaylogics.playwithjava.designpatterns.behavioral.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaStoreTest {

    @Test
    public void testMargheritaPizza(){
        Pizza pizza = new Margherita();
        assertEquals(pizza.description, "Margherita");
        assertEquals(pizza.getCost(), 100);
    }

    @Test
    public void testFarmhouseFreshTomatoPaneerPizza(){
        Pizza pizza = new FarmHouse();
        assertEquals(pizza.getDescription(), "FarmHouse");
        assertEquals(pizza.getCost(), 200);
        pizza = new FreshTomato(pizza);
        assertEquals(pizza.getDescription(), "FarmHouse, Fresh Tomato");
        assertEquals(pizza.getCost(), 240);
        pizza = new Paneer(pizza);
        assertEquals(pizza.getDescription(), "FarmHouse, Fresh Tomato, Paneer");
        assertEquals(pizza.getCost(), 310);
    }

    @Test
    public void testBarbequePizza(){
        try {
            Pizza pizza = new Barbeque(null);
            pizza.getCost();
            fail("Expected NullPointerException without Pizza Topping should work");
        } catch (NullPointerException e) {
            assertNotNull(e);
        }

    }

}