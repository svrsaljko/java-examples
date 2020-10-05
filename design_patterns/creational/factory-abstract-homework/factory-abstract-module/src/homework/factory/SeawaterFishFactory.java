package homework.factory;

import homework.abstracts.factory.AbstractFactoryFish;
import homework.interfaces.Fish;
import homework.models.Srdela;
import homework.models.Ugor;

/**
 * The SeawaterFishFactory class provides method implementation for factory
 */
public class SeawaterFishFactory extends AbstractFactoryFish {

    @Override
    public Fish getFish(String fishName) {
        if (fishName.equalsIgnoreCase("SRDELA")) {
            return new Srdela();
        } else if (fishName.equalsIgnoreCase("UGOR")) {
            return new Ugor();
        } else {
            return null;
        }
    }

}
