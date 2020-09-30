package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.needfixes.cloning;

public class Singleton extends SuperClass{
    public static final Singleton INSTANCE = new Singleton();

    private Singleton(){}
}
