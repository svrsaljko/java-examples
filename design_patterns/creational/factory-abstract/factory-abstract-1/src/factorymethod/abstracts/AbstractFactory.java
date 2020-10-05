package factorymethod.abstracts;

import factorymethod.interfaces.Shape;

public abstract  class AbstractFactory {
    public  abstract Shape getShape(String shapeType) ;
}
