package homework.test;

import homework.abstracts.factory.AbstractFactoryFish;
import homework.interfaces.Fish;
import homework.producer.FactoryProducer;

/**
 * The Test class provides test method, for testing abstract factory functionality
 */
public class Test {

    /**
     * Fish constants
     */
    static final String UGOR = "UGOR";
    static final String SRDELA = "SRDELA";
    static final String SARAN = "SARAN";
    static final String SOM = "SOM";

    public static void test() {

        System.out.println("test ...");

        /**
         * seawaterFishFactory implementation
         */
        AbstractFactoryFish seawaterFishFactory = FactoryProducer.getFactory(true);
        Fish ugor = seawaterFishFactory.getFish(UGOR);
        ugor.printDetails();
        Fish srdela = seawaterFishFactory.getFish(SRDELA);
        srdela.printDetails();

        /**
         * freshwaterFishFactory implementation
         */
        AbstractFactoryFish freshwaterFishFactory = FactoryProducer.getFactory(false);
        Fish som = freshwaterFishFactory.getFish(SOM);
        som.printDetails();
        Fish saran = freshwaterFishFactory.getFish(SARAN);
        saran.printDetails();

    }
}
