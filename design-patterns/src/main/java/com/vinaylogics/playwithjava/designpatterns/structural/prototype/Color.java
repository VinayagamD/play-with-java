package com.vinaylogics.playwithjava.designpatterns.structural.prototype;

public abstract class Color implements Cloneable {

    protected String colorName;

    abstract void addColor();

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
