package example.game.algorithms.models;

import example.game.algorithms.interfaces.GameAlgorithmStrategy;

/**
 * Game class provides methods for changing algorithm
 * and getting algorithm difficulty level
 */
public class Game {

    GameAlgorithmStrategy gameAlgorithmStrategy;

    public Game(GameAlgorithmStrategy gameAlgorithmStrategy) {
        this.gameAlgorithmStrategy = gameAlgorithmStrategy;
    }

    public void changeAlgorithm(GameAlgorithmStrategy gameAlgorithmStrategy) {
        this.gameAlgorithmStrategy = gameAlgorithmStrategy;
    }

    public void playGame() {
        gameAlgorithmStrategy.algorithmDifficulty();
    }

}
