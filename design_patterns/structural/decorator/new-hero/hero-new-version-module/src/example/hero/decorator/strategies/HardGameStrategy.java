package example.hero.decorator.strategies;

import example.hero.decorator.interfaces.GameAlgorithmStrategy;

/**
 * HardGameStrategy class provides strategy for HARD GAME difficulty
 */
final public class HardGameStrategy implements GameAlgorithmStrategy {

    @Override
    public int algorithmDifficulty() {

        System.out.println("HARD_GAME");
        return 3;

    }

}
