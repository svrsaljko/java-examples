package example.hero.decorator.concrete.decorators;

import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.models.HeroModel;

/**
 * HeroSwordDecorator class provides sword decorator
 */
public class HeroSwordDecorator implements Hero {

    final static int SWORD_POWER = 60;
    HeroModel decoratedHero;

    public HeroSwordDecorator(HeroModel decoratedHero) {

        this.decoratedHero = decoratedHero;

    }

    @Override
    public void attack(int algorithmDifficultyLevel) {

        System.out.println(decoratedHero.getHeroType() +
                " collect sword! Increase attack power by: "
                + algorithmDifficultyLevel * SWORD_POWER + "!");

        int swordAttackPower = decoratedHero.getAttackPower() + SWORD_POWER;

        decoratedHero.setAttackPower(swordAttackPower);
        decoratedHero.attack(algorithmDifficultyLevel);

    }

    @Override
    public void defend(int algorithmDifficultyLevel) {

        decoratedHero.defend(algorithmDifficultyLevel);

    }

}
