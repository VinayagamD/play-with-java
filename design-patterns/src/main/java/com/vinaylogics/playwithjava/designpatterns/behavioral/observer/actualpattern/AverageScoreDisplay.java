package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.actualpattern;

public class AverageScoreDisplay implements Observer {

    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int)(this.runRate*50);
        display();
    }

    public void display(){
        System.out.println("\nAverage Score Display");
        System.out.println("Run Rate : "+ runRate);
        System.out.println("Predicted Score : "+ predictedScore);
    }
}
