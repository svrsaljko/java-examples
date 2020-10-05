package factorymethod.models;
import factorymethod.interfaces.Shape;


public class Rectangle  implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
