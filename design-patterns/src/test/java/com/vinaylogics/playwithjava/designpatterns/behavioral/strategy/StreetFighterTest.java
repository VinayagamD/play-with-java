package com.vinaylogics.playwithjava.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreetFighterTest {

    private JumpBehavior shortJump;
    private JumpBehavior longJump;
    private KickBehavior tornadoKick;

    @BeforeEach
    public void setUp(){
        shortJump = new ShortJump();
        longJump = new LongJump();
        tornadoKick = new TornadoKick();
    }


    @Test
    public void testBehaviour(){
        Fighter ken = new Ken(tornadoKick,shortJump);
        ken.display();

        ken.punch();
        ken.kick();
        ken.jump();

        ken.setJumpBehavior(longJump);
        ken.jump();
    }

}