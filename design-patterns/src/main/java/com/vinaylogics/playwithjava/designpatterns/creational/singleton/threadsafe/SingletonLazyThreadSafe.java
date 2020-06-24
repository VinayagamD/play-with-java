package com.vinaylogics.playwithjava.designpatterns.creational.singleton.threadsafe;

public class SingletonLazyThreadSafe {

    private static SingletonLazyThreadSafe instance;

    private SingletonLazyThreadSafe(){}

    public static synchronized SingletonLazyThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonLazyThreadSafe();
        }
        return instance;
    }


}
