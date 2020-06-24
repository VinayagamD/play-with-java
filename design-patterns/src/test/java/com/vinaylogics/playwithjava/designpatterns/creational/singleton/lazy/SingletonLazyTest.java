package com.vinaylogics.playwithjava.designpatterns.creational.singleton.lazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonLazyTest {

    @Test
    void tesGetInstance() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        assertEquals(singletonLazy,singletonLazy1, "Lazy Singleton Success");
    }
}