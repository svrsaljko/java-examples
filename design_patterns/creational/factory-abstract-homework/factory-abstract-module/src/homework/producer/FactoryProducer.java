package homework.producer;

import homework.abstracts.factory.AbstractFactoryFish;
import homework.factory.FreshwaterFishFactory;
import homework.factory.SeawaterFishFactory;

/**
 * The FactoryProducer class provides method getFactory, for getting one particular factory
 */
public class FactoryProducer {

    public static AbstractFactoryFish getFactory(boolean seawaterFish) {
        if (seawaterFish) {
            return new SeawaterFishFactory();
        } else {
            return new FreshwaterFishFactory();
        }
    }

}
