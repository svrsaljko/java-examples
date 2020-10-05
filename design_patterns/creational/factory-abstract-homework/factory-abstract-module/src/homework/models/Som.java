package homework.models;

import homework.interfaces.Fish;

/**
 * The Som class provides Fish model with overriden printDetailsMethod
 */
public class Som implements Fish {

    @Override
    public void printDetails() {
        System.out.println("Som, tasty freshwater fish with mustache");
    }

}
