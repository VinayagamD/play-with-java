package com.vinaylogics.playwithjava.designpatterns.behavioral.strategy;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
