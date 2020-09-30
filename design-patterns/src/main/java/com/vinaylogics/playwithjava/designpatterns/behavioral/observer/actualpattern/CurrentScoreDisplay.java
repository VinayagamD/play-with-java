package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.actualpattern;

public class CurrentScoreDisplay implements Observer{
    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\nCurrent Score Display");
        System.out.println("Runs : "+ runs);
        System.out.println("Wickets : "+ wickets);
        System.out.println("Overs : "+ overs);
    }
}
