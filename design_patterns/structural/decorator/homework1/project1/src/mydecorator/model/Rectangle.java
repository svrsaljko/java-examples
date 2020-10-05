package mydecorator.model;

import mydecorator.interfaces.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {

        System.out.println("Shape: Rectangle");

    }

}
