package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.needfixes.cloning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void testObjectWillBeClonedIssue() throws CloneNotSupportedException {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = (Singleton) instance1.clone();
        assertNotEquals(instance1.hashCode(), instance2.hashCode());
    }
}