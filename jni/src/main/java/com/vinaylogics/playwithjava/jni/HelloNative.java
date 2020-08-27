package com.vinaylogics.playwithjava.jni;

public class HelloNative {

    public static void main(String[] args) {
        new HelloNative().nativeGreeting();
    }

    private native void nativeGreeting();
}
