package example.hero.decorator.test;

import example.hero.decorator.models.Game;
import example.hero.decorator.strategies.EasyGameStrategy;
import example.hero.decorator.strategies.HardGameStrategy;
import example.hero.decorator.strategies.MediumGameStrategy;

/**
 * Test class provides static test method for testing Strategy design pattern
 */
public class Test {
    public static void test() {

        System.out.println("Testing game difficulty algorithms: ");

        Game game = new Game(new EasyGameStrategy());
        TestGame.play(game.algorithmDifficultyLevel());
        System.out.println("\n\n\n");

        game.changeAlgorithm(new MediumGameStrategy());
        TestGame.play(game.algorithmDifficultyLevel());
        System.out.println("\n\n\n");

        game.changeAlgorithm(new HardGameStrategy());
        TestGame.play(game.algorithmDifficultyLevel());

    }

}
