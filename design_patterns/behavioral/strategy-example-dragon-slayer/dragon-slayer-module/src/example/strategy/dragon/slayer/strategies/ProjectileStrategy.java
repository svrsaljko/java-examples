package example.strategy.dragon.slayer.strategies;

import example.strategy.dragon.slayer.interfaces.DragonSlayingStrategy;

public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {

        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");

    }
}
