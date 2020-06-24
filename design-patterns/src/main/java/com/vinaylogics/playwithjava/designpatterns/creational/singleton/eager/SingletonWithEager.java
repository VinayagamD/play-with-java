package com.vinaylogics.playwithjava.designpatterns.creational.singleton.eager;

/**
 *
 */
public class SingletonWithEager {

    /**
     *
     */
    private static final SingletonWithEager INSTANCE = new SingletonWithEager();

    /**
     *
     */
    private SingletonWithEager(){

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonWithEager getINSTANCE() {
        return INSTANCE;
    }

}
