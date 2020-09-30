package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.fixes.cloning;

public class Singleton extends SuperClass {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
