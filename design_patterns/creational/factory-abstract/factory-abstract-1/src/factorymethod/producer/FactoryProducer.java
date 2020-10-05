package factorymethod.producer;


import factorymethod.abstracts.AbstractFactory;
import factorymethod.factory.RoundedShapeFactory;
import factorymethod.factory.ShapeFactory;

public class FactoryProducer {
        public static AbstractFactory getFactory(boolean rounded){
            if(rounded){
                return new RoundedShapeFactory();
            }else{
                return new ShapeFactory();
            }
        }
    }

