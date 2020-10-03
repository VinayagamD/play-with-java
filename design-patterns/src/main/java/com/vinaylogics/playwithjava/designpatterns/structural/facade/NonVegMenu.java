package com.vinaylogics.playwithjava.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class NonVegMenu implements Menus {
    @Override
    public List<String> getMenu() {
        return Arrays.asList("Chicken", "Mutton", "Fish", "Crab", "Duck", "Egg", "Eel", "Lobster");
    }
}
