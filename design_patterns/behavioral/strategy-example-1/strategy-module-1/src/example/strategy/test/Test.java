package example.strategy.test;

import example.strategy.context.Context;
import example.strategy.operations.*;


public class Test {

    public static void test(){

        System.out.println("strategy pattern test ...");

        Context contextOpAdd = new Context( new OperationAdd());
        Context contextOpSubstr = new Context( new OperationSubstract());
        Context contextOpMulti = new Context( new OperationMultiply());

        System.out.println("operation add: 2+2 = " + contextOpAdd.executeStrategy(2,2));
        System.out.println("operation substract: 2-2 = " + contextOpSubstr.executeStrategy(2,2));
        System.out.println("operation multiply: 3*2 = " + contextOpMulti.executeStrategy(3,2));

    }
}
