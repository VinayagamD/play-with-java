package com.vinaylogics.playwithjava.designpatterns.structural.template;

public abstract class OrderProcessTemplate {

    public boolean isGift;

    public abstract void doSelect();

    public abstract void doPayment();

    public final void giftWarp(){
        try{
            System.out.println("Gift wrap successful");
        }catch (Exception e){
            System.out.println("Gift wrap unsuccessful");
        }
    }

    public abstract void doDelivery();

    public final void processOrder(boolean isGift){
        doSelect();
        doPayment();
        if(isGift){
            giftWarp();
        }
        doDelivery();
    }
}
