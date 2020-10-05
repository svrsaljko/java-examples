package factorymethod.factory;

import factorymethod.abstracts.AbstractFactory;
import factorymethod.interfaces.Shape;
import factorymethod.models.Rectangle;
import factorymethod.models.Square;

public class ShapeFactory extends AbstractFactory {

    //use getShape method to get object of type shape
    @Override
    public  Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
