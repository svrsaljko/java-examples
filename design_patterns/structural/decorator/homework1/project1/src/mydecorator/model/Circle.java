package mydecorator.model;

import mydecorator.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {

        System.out.println("Shape: Circle");

    }

}
