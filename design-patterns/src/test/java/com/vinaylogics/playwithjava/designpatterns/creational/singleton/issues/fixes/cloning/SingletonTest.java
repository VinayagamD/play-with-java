package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.fixes.cloning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void testCloneNotAllowed(){
        Singleton instance1 = Singleton.INSTANCE;
        try {
            Singleton instance2 = (Singleton) instance1.clone();
            fail("Expected CloneNotSupportedException");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            assertNotNull(e);
        }
    }
}