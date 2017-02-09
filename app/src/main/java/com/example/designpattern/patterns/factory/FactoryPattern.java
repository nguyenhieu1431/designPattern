package com.example.designpattern.patterns.factory;

/**
 * Created by Admin on 2/9/2017.
 */

public class FactoryPattern {
    private static IShape shape;

    public static void build(int type) {
        if (type == 0) {
            shape = new Rect();
        } else if (type == 1) {
            shape = new Square();
        }
        shape.draw();
    }
}
