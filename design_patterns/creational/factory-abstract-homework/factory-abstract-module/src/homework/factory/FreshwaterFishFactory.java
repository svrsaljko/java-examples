package homework.factory;

import homework.abstracts.factory.AbstractFactoryFish;
import homework.interfaces.Fish;
import homework.models.Saran;
import homework.models.Som;

/**
 * The FreshwaterFishFactory class provides method implementation for factory
 */
public class FreshwaterFishFactory extends AbstractFactoryFish {

    @Override
    public Fish getFish(String fishName) {
        if (fishName.equalsIgnoreCase("SOM")) {
            return new Som();
        } else if (fishName.equalsIgnoreCase("SARAN")) {
            return new Saran();
        } else {
            return null;
        }
    }

}
