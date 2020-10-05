package factorymethod.models;
import factorymethod.interfaces.Shape;


public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
