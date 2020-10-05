package factorymethod.factory;

import factorymethod.abstracts.AbstractFactory;
import factorymethod.interfaces.Shape;
import factorymethod.models.RoundedRectangle;
import factorymethod.models.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public  Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
