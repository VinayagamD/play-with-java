package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.fixes;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SingletonReflectionTest {

    @Test
    public void testReflectionInstance_Same(){
        SingletonReflection instance1 = SingletonReflection.INSTANCE;
        SingletonReflection instance2 = null;
       try{
            Constructor[] constructors = SingletonReflection.class.getDeclaredConstructors();
            for (Constructor constructor:constructors) {
                constructor.setAccessible(true);
                instance2 = (SingletonReflection) constructor.newInstance();
            }
            fail("Enum should not be allowed to create");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | IllegalArgumentException e) {
            assertNotNull(e);
        }
        System.out.println("instance1 hashcode"+instance1.hashCode());
        assertNull(instance2);
    }

}