package homework.models;

import homework.interfaces.Fish;

/**
 * The Saran class provides Fish model with overriden printDetailsMethod
 */
public class Saran implements Fish {

    @Override
    public void printDetails() {
        System.out.println("Saran, tasty freshwater fish!");
    }

}
