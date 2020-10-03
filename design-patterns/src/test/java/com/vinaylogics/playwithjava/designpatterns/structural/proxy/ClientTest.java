package com.vinaylogics.playwithjava.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void testProxies(){
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("vinaylogics.com");
            internet.connectTo("geeksforgeeks.com");
            internet.connectTo("abc.com");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}