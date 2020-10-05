package homework.models;

import homework.interfaces.Fish;

/**
 * The Ugor class provides Fish model with overriden printDetailsMethod
 */
public class Ugor implements Fish {

    @Override
    public void printDetails() {
        System.out.println("Ugor, large black and tasty seawater fish");
    }

}
