package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.actualpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CricketDataTest {
    Subject subject;
    Observer observer1;
    Observer observer2;

    @BeforeEach
    void setUp() {
        observer1 = new AverageScoreDisplay();
        observer2 = new CurrentScoreDisplay();
        subject = new CricketData();
    }

    @Test
    public void testDataChanged(){
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        ((CricketData)subject).dataChanged();
    }
}