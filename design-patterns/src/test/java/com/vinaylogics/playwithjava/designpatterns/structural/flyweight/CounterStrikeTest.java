package com.vinaylogics.playwithjava.designpatterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CounterStrikeTest {
    // All player types and weapon (used by getRandPlayerType()
    // and getRandWeapon()
    private static String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    @Test
    public void testPlayerFactory(){
        for (int i = 0; i < 10; i++) {
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }

    // Utility methods to get a random player type and
    // weapon
    public static String getRandPlayerType()
    {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }
}