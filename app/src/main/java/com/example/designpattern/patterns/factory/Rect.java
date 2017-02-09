package com.example.designpattern.patterns.factory;

import android.util.Log;

/**
 * Created by Admin on 2/9/2017.
 */

public class Rect implements IShape {
    @Override
    public void draw() {
        Log.i("PATTERN", "RECT");
    }
}
