package example.hero.decorator.concrete.decorators;

import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.models.HeroModel;

/**
 * HeroShieldDecorator class provides shield decorator
 */
public class HeroShieldDecorator implements Hero {

    final static int SHIELD_POWER = 100;
    HeroModel decoratedHero;

    public HeroShieldDecorator(HeroModel decoratedHero) {

        this.decoratedHero = decoratedHero;

    }

    @Override
    public void defend(int algorithmDifficultyLevel) {

        System.out.println(decoratedHero.getHeroType() +
                " collect shield! Increase defense power by: "
                + algorithmDifficultyLevel * SHIELD_POWER + "!");

        int shieldDefensePower = decoratedHero.getDefensePower() + SHIELD_POWER;

        decoratedHero.setDefensePower(shieldDefensePower);
        decoratedHero.defend(algorithmDifficultyLevel);

    }

    @Override
    public void attack(int algorithmDifficultyLevel) {

        decoratedHero.attack(algorithmDifficultyLevel);

    }

}
