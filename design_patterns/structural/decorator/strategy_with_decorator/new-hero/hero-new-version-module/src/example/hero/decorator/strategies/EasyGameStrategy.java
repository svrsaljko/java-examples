package example.hero.decorator.strategies;

import example.hero.decorator.interfaces.GameAlgorithmStrategy;

/**
 * EasyGameStrategy class provides strategy for EASY GAME difficulty
 */
final public class EasyGameStrategy implements GameAlgorithmStrategy {

    @Override
    public int algorithmDifficulty() {

        System.out.println("EASY GAME");
        return 1;

    }

}
