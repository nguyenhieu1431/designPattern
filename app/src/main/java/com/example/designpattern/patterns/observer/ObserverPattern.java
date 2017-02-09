package com.example.designpattern.patterns.observer;

/**
 * Created by Admin on 2/9/2017.
 */

public class ObserverPattern {
    public void build() {
        Subject subject = new Subject();
        subject.attach(new HexaObserver());
        subject.attach(new BinaryObserver());

        subject.setState(0);
    }
}
