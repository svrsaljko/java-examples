package example.decorator.troll.tests;

import example.decorator.troll.interfaces.Troll;
import example.decorator.troll.models.ArmoredTroll;
import example.decorator.troll.models.ClubbedTroll;
import example.decorator.troll.models.SimpleTroll;

public class Test {
    public static void test() {

        System.out.println("Troll example decorator testing ... ");

        // simple troll
        Troll troll = new SimpleTroll();
        troll.attack(); // The troll tries to grab you!
        troll.fleeBattle(); // The troll shrieks in horror and runs away!
        System.out.println("ATTACK POWER: " + troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        Troll clubbedTroll = new ClubbedTroll(troll);
        System.out.println("ATTACK POWER: " + clubbedTroll.getAttackPower());

        clubbedTroll.attack(); // The troll tries to grab you! The troll swings at you with a club!
        clubbedTroll.fleeBattle(); // The troll shrieks in horror and runs away!

        // ARMORED TROLL
        Troll armoredTroll = new ArmoredTroll(clubbedTroll);
        System.out.println("ATTACK POWER: " + armoredTroll.getAttackPower());


    }
}
