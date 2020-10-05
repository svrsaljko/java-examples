package example.hero.decorator.concrete.decorator;

import example.hero.decorator.abstracts.HeroDecorator;
import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.model.HeroModel;
import example.hero.decorator.model.Soldier;

public class HeroSwordDecorator extends HeroDecorator {

    final static int SWORD_POWER = 40;

    public HeroSwordDecorator(HeroModel decoratedHero) {
        super(decoratedHero);
    }

    @Override
    public void attack() {
        System.out.println(decoratedHero.getHeroType() + " collect sword! Increase power!");
        int swordAttackPower = decoratedHero.getAttackPower() + SWORD_POWER;
        decoratedHero.setAttackPower(  swordAttackPower );
        decoratedHero.attack();
    }

    @Override
    public void defend() {
        decoratedHero.defend();
    }

}
