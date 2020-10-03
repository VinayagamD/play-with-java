package com.vinaylogics.playwithjava.designpatterns.structural.facade;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
