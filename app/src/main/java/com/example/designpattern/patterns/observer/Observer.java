package com.example.designpattern.patterns.observer;

/**
 * Created by Admin on 2/9/2017.
 */

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
