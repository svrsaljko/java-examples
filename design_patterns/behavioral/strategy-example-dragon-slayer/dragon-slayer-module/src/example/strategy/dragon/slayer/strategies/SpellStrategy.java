package example.strategy.dragon.slayer.strategies;

import example.strategy.dragon.slayer.interfaces.DragonSlayingStrategy;

public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {

        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");

    }
}
