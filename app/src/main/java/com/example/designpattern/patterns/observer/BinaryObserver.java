package com.example.designpattern.patterns.observer;

import android.util.Log;

/**
 * Created by Admin on 2/9/2017.
 */

public class BinaryObserver extends Observer {
    @Override
    public void update() {
        Log.i("PATTERN","BINARY OBSERVER");
    }
}
