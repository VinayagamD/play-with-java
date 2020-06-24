package com.vinaylogics.playwithjava.designpatterns.creational.singleton.eager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonWithEagerTest {
    @Test
    void testGetINSTANCE() {
        SingletonWithEager singletonWithEager1 = SingletonWithEager.getINSTANCE();
        SingletonWithEager singletonWithEager2 = SingletonWithEager.getINSTANCE();
        assertEquals(singletonWithEager1,singletonWithEager2, "Singleton Eager success");
    }
}