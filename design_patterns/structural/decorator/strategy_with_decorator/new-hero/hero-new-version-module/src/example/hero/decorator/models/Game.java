package example.hero.decorator.models;

import example.hero.decorator.interfaces.GameAlgorithmStrategy;
import example.hero.decorator.interfaces.GameModel;

/**
 * Game class provides methods for changing algorithm
 * and getting algorithm difficulty level
 */
public class Game implements GameModel {

    GameAlgorithmStrategy gameAlgorithmStrategy;

    public Game(GameAlgorithmStrategy gameAlgorithmStrategy) {

        this.gameAlgorithmStrategy = gameAlgorithmStrategy;

    }

    public void changeAlgorithm(GameAlgorithmStrategy gameAlgorithmStrategy) {

        this.gameAlgorithmStrategy = gameAlgorithmStrategy;

    }

    public int algorithmDifficultyLevel() {

        return gameAlgorithmStrategy.algorithmDifficulty();

    }

}
