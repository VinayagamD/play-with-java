package com.vinaylogics.playwithjava.designpatterns.behavioral.observer.actualpattern;

public interface Subject {

    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
