package com.vinaylogics.playwithjava.designpatterns.structural.facade;

public class VegRestaurant implements Hotel{

    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
