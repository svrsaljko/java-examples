package example.hero.decorator.test;

import example.hero.decorator.abstracts.HeroDecorator;
import example.hero.decorator.concrete.decorator.HeroShieldDecorator;
import example.hero.decorator.concrete.decorator.HeroSwordDecorator;
import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.model.*;


public class Test {

    public static void test(){

        System.out.println("hero testing ...");

        // Soldier
        Hero soldier1 = new HeroSwordDecorator(new Soldier());
        soldier1.attack();
        soldier1 = new HeroShieldDecorator(new Soldier());
        soldier1.defend();
        System.out.println("\n\n");

        // Pirate
        Hero  pirate1 = new HeroSwordDecorator(new Pirate());
        System.out.println("adress: " + pirate1);

        pirate1.attack();
        pirate1 = new HeroShieldDecorator(new Pirate());
        System.out.println("adress: " + pirate1);

        pirate1.defend();
        System.out.println("adress: " + pirate1);
        System.out.println("\n\n");


        // Teuton
        Hero  teuton1 = new HeroSwordDecorator(new Teuton());
        teuton1.attack();
        teuton1 = new HeroShieldDecorator(new Teuton());
        teuton1.defend();
        System.out.println("\n\n");



        // Knight

        var knight = new Knight();
        var knightSword = new HeroSwordDecorator(knight);
        var knightShieldAndSword = new HeroShieldDecorator(knightSword);


        //HeroModel knight = new Knight();
        //HeroModel knightSword = new HeroSwordDecorator(knight);
        //HeroModel knightShieldAndSword = new HeroShieldDecorator(knightSword);
        //knightShieldAndSword.defend();
        //knightShieldAndSword.attack();
        System.out.println("\n\n");





    }

}
