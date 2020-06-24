package com.vinaylogics.playwithjava.designpatterns.creational.singleton.lazy;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
