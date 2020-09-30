package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.needfixes;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
    private static final long serialVersionUID = 3153917724270351401L;

    public static final SingletonSerialization instance = new SingletonSerialization();

    private SingletonSerialization(){}
}
