package com.vinaylogics.playwithjava.designpatterns.structural.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodPatternTest {

    @Test
    public void testTemplateMethod(){
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }

}