package example.hero.decorator.concrete.decorator;

import example.hero.decorator.abstracts.HeroDecorator;
import example.hero.decorator.model.HeroModel;

public class HeroShieldDecorator extends HeroDecorator {


    final static int SHIELD_DEFENSE = 40;

    public HeroShieldDecorator(HeroModel decoratedHero) {
        super(decoratedHero);
    }

    @Override
    public void attack() {
        decoratedHero.attack();
    }

    @Override
    public void defend() {
        System.out.println(decoratedHero.getHeroType() + " collect shield! Increase defense!");
        int shieldDefensePower = decoratedHero.getDefensePower() + SHIELD_DEFENSE;
        decoratedHero.setDefensePower(  shieldDefensePower );
        decoratedHero.defend();
    }

}
