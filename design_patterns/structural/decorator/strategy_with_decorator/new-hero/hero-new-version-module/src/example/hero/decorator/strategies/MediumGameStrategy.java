package example.hero.decorator.strategies;

import example.hero.decorator.interfaces.GameAlgorithmStrategy;

/**
 * MediumGameStrategy class provides strategy for MEDIUM GAME difficulty
 */
final public class MediumGameStrategy implements GameAlgorithmStrategy {

    @Override
    public int algorithmDifficulty() {

        System.out.println("MEDIUM GAME");
        return 2;

    }

}
