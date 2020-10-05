package homework.models;

import homework.interfaces.Fish;

/**
 * The Srdela class provides Fish model with overriden printDetailsMethod
 */
public class Srdela implements Fish {

    @Override
    public void printDetails() {
        System.out.println("Srdela, It's not my that fault I am a blue fish");
    }

}
