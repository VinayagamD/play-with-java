package com.vinaylogics.playwithjava.designpatterns.creational.singleton.eager;

public class SingletonEagerStatic {

    public static final SingletonEagerStatic instance;

    private SingletonEagerStatic(){}


    static {
        instance = new SingletonEagerStatic();
    }

}
