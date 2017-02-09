package com.example.designpattern.patterns.singleton;

/**
 * Created by Admin on 2/9/2017.
 */

public class SingletonPattern {
    private static SingletonPattern sObject;

    public SingletonPattern makeInstance() {
        if (sObject == null) {
            sObject = new SingletonPattern();
        }
        return sObject;
    }
}
