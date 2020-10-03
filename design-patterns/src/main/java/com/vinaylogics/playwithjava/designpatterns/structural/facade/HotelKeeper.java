package com.vinaylogics.playwithjava.designpatterns.structural.facade;

public class HotelKeeper {

    public VegMenu getVegMenu(){
        VegRestaurant vr = new VegRestaurant();
        return (VegMenu) vr.getMenus();
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nr = new NonVegRestaurant();
        return (NonVegMenu) nr.getMenus();
    }

    public Both getVegNonMenu(){
        VegNonBothRestaurant vnb = new VegNonBothRestaurant();
        return (Both)vnb.getMenus();
    }
}
