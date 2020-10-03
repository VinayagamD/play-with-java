package com.vinaylogics.playwithjava.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    
    @Test
    public void testMenuFacade(){
        HotelKeeper keeper = new HotelKeeper();
        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        Both both = keeper.getVegNonMenu();

        System.out.println("-------------- VEG MENU -------------");
        vegMenu.getMenu().forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("-------------- NON-VEG MENU -------------");
        nonVegMenu.getMenu().forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("-------------- BOTH MENU -------------");
        both.getMenu().forEach(System.out::println);
        System.out.println("-------------------------------------");
    }

}