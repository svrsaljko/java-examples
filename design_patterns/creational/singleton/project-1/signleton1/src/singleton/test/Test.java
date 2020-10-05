package singleton.test;

import singleton.model.Model;

public class Test {
    public static void test() {
        System.out.println("test...");
        System.out.println("state after singleton: ");
        Model singleton = Model.getInstance();
        singleton.printState();
        System.out.println("java address 1: " + singleton);
        Model singleton2 = Model.getInstance();
        System.out.println("java address 2: " + singleton2);

    }
}
