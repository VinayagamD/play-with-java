package com.vinaylogics.playwithjava.designpatterns.creational.singleton.threadsafe;

public class SingletonBigPugh {

    private SingletonBigPugh(){}

    // Inner class to provide instance of class
    private static class BillPughSingleton{
        private static final SingletonBigPugh INSTANCE = new SingletonBigPugh();
    }

    public static SingletonBigPugh getInstance(){
        return BillPughSingleton.INSTANCE;
    }
}
