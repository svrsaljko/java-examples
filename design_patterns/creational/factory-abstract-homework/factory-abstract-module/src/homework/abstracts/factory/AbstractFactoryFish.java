package homework.abstracts.factory;

import homework.interfaces.Fish;

/**
 * The AbstractFactoryFish abstract class provides template for multiple factories
 */
public abstract class AbstractFactoryFish {

    public abstract Fish getFish(String fishName);

}
