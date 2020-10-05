package example.game.algorithms.strategies;

import example.game.algorithms.interfaces.GameAlgorithmStrategy;

/**
 * HardGameStrategy class provides strategy for HARD GAME difficulty
 */
public class HardGameStrategy implements GameAlgorithmStrategy {

    @Override
    public void algorithmDifficulty() {

        System.out.println("hard game");

    }

}
