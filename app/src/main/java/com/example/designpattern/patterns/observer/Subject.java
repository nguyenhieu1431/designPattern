package com.example.designpattern.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2/9/2017.
 */

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
