package mydecorator.test;

import mydecorator.concrete.decorator.RedShapeDecorator;
import mydecorator.interfaces.Shape;
import mydecorator.model.Circle;
import mydecorator.model.Rectangle;

public class Test {

    static public void test() {

        System.out.println("testovi ....");

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}

