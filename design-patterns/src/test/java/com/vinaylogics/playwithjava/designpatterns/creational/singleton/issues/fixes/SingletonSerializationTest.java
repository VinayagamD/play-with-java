package com.vinaylogics.playwithjava.designpatterns.creational.singleton.issues.fixes;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SingletonSerializationTest {
    @Test
    public void testSingletonSerialization(){
        SingletonSerialization instance1 = SingletonSerialization.instance;
        SingletonSerialization instance2 = null;

        try(ObjectOutput out= new ObjectOutputStream(new FileOutputStream("FileFix.text"))){
            out.writeObject(instance1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("FileFix.text"))){
            instance2 = (SingletonSerialization) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals(instance1.hashCode(), instance2.hashCode());

    }
}