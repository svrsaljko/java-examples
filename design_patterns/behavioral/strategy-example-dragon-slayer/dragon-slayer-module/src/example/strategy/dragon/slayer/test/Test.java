package example.strategy.dragon.slayer.test;

import example.strategy.dragon.slayer.models.DragonSlayer;
import example.strategy.dragon.slayer.strategies.*;


public class Test {

    public static void test(){

        System.out.println("Dragon slayer strategy pattern example test ... ");


        DragonSlayer dragonSlayer = new DragonSlayer(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new MeleeStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

    }

}
