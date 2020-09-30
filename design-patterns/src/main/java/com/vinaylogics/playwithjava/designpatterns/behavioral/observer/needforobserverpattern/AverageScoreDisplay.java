package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.needforobserverpattern;

public class AverageScoreDisplay {
    private float runRate;
    private int predictedScore;

    public void update(int runs, int wickets, float over) {
        this.runRate = (float) runs/over;
        this.predictedScore = (int)(this.runRate*50);
        display();
    }

    public void display(){
        System.out.println("\n Average Score Display");
        System.out.println("Run Rate : "+ runRate);
        System.out.println("Predicted Score : "+ predictedScore);
    }
}
