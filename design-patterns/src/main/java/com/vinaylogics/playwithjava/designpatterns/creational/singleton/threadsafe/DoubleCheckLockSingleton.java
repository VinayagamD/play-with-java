package com.vinaylogics.playwithjava.designpatterns.creational.singleton.threadsafe;

public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton obj;

    private DoubleCheckLockSingleton(){}

    private static DoubleCheckLockSingleton getInstance(){
        if(obj == null){
            // To Make Thread Safe
            synchronized (DoubleCheckLockSingleton.class){
                // check again as multiple threads
                // can reach above steps
                if(obj == null){
                    obj = new DoubleCheckLockSingleton();
                }
            }
        }
        return obj;
    }
}
