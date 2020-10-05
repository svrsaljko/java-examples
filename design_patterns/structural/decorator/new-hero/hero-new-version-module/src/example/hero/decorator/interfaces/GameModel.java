package example.hero.decorator.interfaces;

/**
 * GameModel interface contains methods for
 * changing algorithm and getting algorithm difficulty level
 */
public interface GameModel {

    void changeAlgorithm(GameAlgorithmStrategy gameAlgorithmStrategy);

    int algorithmDifficultyLevel();

}
