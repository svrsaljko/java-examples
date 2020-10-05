package example.hero.decorator.test;

import example.hero.decorator.concrete.decorators.HeroShieldDecorator;
import example.hero.decorator.concrete.decorators.HeroSwordDecorator;
import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.models.*;

/**
 * TestGame class provides static play method for testing Decorator design pattern
 */
public class TestGame {

    public static void play(int algorithmDifficultyLevel) {

        System.out.println("Hero decorator tests ... ");

        // SOLDIER
        Hero soldier = new Soldier();
        soldier.attack(algorithmDifficultyLevel);
        soldier.defend(algorithmDifficultyLevel);

        Hero soldierSword = new HeroSwordDecorator((HeroModel) soldier);
        System.out.println("SWORD");
        soldierSword.attack(algorithmDifficultyLevel);
        soldierSword.defend(algorithmDifficultyLevel);

        Hero soldierSwordShield = new HeroShieldDecorator((HeroModel) soldier);
        System.out.println("SHIELD");
        soldierSwordShield.defend(algorithmDifficultyLevel);
        soldierSwordShield.attack(algorithmDifficultyLevel);

        System.out.println("\n\n\n");

        // KNIGHT
        Hero knight = new Knight();
        knight.attack(algorithmDifficultyLevel);
        knight.defend(algorithmDifficultyLevel);

        Hero knightSword = new HeroSwordDecorator((HeroModel) knight);
        System.out.println("SWORD");
        knightSword.attack(algorithmDifficultyLevel);
        knightSword.defend(algorithmDifficultyLevel);

        Hero knightSwordShield = new HeroShieldDecorator((HeroModel) knight);
        System.out.println("SHIELD");
        knightSwordShield.defend(algorithmDifficultyLevel);
        knightSwordShield.attack(algorithmDifficultyLevel);

        System.out.println("\n\n\n");

        // PIRATE
        Hero pirate = new Pirate();
        pirate.attack(algorithmDifficultyLevel);
        pirate.defend(algorithmDifficultyLevel);

        Hero pirateSword = new HeroSwordDecorator((HeroModel) pirate);
        System.out.println("SWORD");
        pirateSword.attack(algorithmDifficultyLevel);
        pirateSword.defend(algorithmDifficultyLevel);

        Hero pirateSwordShield = new HeroShieldDecorator((HeroModel) pirate);
        System.out.println("SHIELD");
        pirateSwordShield.defend(algorithmDifficultyLevel);
        pirateSwordShield.attack(algorithmDifficultyLevel);

        System.out.println("\n\n\n");

        // TEUTON
        Hero teuton = new Teuton();
        teuton.attack(algorithmDifficultyLevel);
        teuton.defend(algorithmDifficultyLevel);

        Hero teutonShield = new HeroShieldDecorator((HeroModel) teuton);
        System.out.println("SHIELD");
        teutonShield.defend(algorithmDifficultyLevel);
        teutonShield.attack(algorithmDifficultyLevel);

        Hero teutonSwordShield = new HeroSwordDecorator((HeroModel) teuton);
        System.out.println("SWORD");
        teutonSwordShield.attack(algorithmDifficultyLevel);
        teutonSwordShield.defend(algorithmDifficultyLevel);

        System.out.println("\n\n\n");

    }

}
