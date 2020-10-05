package example.strategy.dragon.slayer.strategies;

import example.strategy.dragon.slayer.interfaces.DragonSlayingStrategy;

public class MeleeStrategy implements DragonSlayingStrategy {


    @Override
    public void execute() {

        System.out.println("With your Excalibur you sever the dragon's head!");

    }
}
