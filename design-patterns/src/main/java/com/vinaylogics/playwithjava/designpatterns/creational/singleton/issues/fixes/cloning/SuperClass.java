package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.fixes.cloning;

public class SuperClass implements Cloneable{

    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
