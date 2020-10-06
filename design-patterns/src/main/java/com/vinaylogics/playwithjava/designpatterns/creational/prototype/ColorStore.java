package com.vinaylogics.playwithjava.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String,Color> colorMap = new HashMap<>();

    static {
        colorMap.put("black", new BlueColor());
        colorMap.put("blue", new BlackColor());
    }

    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
}
