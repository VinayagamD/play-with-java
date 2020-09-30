package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.needforobserverpattern;

public class CurrentScoreDisplay {
    private int runs;
    private int wickets;
    private float overs;

    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display() {
        System.out.println("\n Average Score Display");
        System.out.println("Runs : "+ runs);
        System.out.println("Wickets : "+ wickets);
        System.out.println("Overs : "+ overs);
    }
}
