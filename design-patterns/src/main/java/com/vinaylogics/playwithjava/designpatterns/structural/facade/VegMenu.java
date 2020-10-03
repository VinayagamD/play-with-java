package com.vinaylogics.playwithjava.designpatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class VegMenu implements Menus {
    @Override
    public List<String> getMenu() {
        return Arrays.asList("Gobi", "Potato", "Brinjal", "Fries", "Puri", "Dosa", "Idly", "Vada", "Parota");
    }
}
