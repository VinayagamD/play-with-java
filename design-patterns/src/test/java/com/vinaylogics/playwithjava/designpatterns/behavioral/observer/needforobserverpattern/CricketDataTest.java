package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.needforobserverpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CricketDataTest {
    CricketData cricketData;
    AverageScoreDisplay averageScoreDisplay;
    CurrentScoreDisplay currentScoreDisplay;
    @BeforeEach
    void setUp() {
        averageScoreDisplay = new AverageScoreDisplay();
        currentScoreDisplay = new CurrentScoreDisplay();
        cricketData = new CricketData(currentScoreDisplay,averageScoreDisplay);
    }

    @Test
    void testDataChanged() {
        cricketData.dataChanged();
    }
}