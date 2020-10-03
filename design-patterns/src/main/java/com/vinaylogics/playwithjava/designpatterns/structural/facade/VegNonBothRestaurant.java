package com.vinaylogics.playwithjava.designpatterns.structural.facade;

public class VegNonBothRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        return new Both();
    }
}
