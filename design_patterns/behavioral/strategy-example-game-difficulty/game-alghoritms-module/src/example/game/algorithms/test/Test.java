package example.game.algorithms.test;

import example.game.algorithms.models.Game;
import example.game.algorithms.strategies.EasyGameStrategy;
import example.game.algorithms.strategies.HardGameStrategy;
import example.game.algorithms.strategies.MediumGameStrategy;

/**
 * Test class provides static test method for testing Strategy design pattern
 */
public class Test {

    public static void test() {

        System.out.println("testing game difficulty algorithms: ");

        Game game = new Game(new EasyGameStrategy());
        game.playGame();

        game.changeAlgorithm(new MediumGameStrategy());
        game.playGame();

        game.changeAlgorithm(new HardGameStrategy());
        game.playGame();

    }

}
