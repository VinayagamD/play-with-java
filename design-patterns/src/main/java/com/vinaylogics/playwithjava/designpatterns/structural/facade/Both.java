package com.vinaylogics.playwithjava.designpatterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Both implements Menus {
    private final Menus vegMenu;
    private final Menus nonVegMenu;

    public Both() {
        vegMenu = new VegMenu();
        nonVegMenu = new NonVegMenu();
    }

    @Override
    public List<String> getMenu() {
        List<String> menu = new ArrayList<>();
        menu.addAll(vegMenu.getMenu());
        menu.addAll(nonVegMenu.getMenu());
        return menu;
    }
}
