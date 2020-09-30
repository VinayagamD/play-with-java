package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.needfixes;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SingletonReflectionTest {

    @Test
    public void testSingletonReflectionIssue(){
        SingletonReflection instance1 = SingletonReflection.instance;
        SingletonReflection instance2 = null;
        try{
            Constructor[] constructors = SingletonReflection.class.getDeclaredConstructors();
            for (Constructor constructor:constructors) {
                constructor.setAccessible(true);
                instance2 = (SingletonReflection) constructor.newInstance();
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("instance1 hashcode"+instance1.hashCode());
        System.out.println("instance2 hashcode"+instance2.hashCode());
        assertNotEquals(instance1.hashCode(), instance2.hashCode());
    }

}