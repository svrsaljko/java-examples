package example.hero.decorator.models;

import example.hero.decorator.interfaces.Hero;

/**
 * Soldier class provides initial data for modeling Soldier object
 */
final public class Soldier extends HeroModel implements Hero {

    final static int INITIAL_ATTACK_POWER = 50;
    final static int INITIAL_DEFENSE_POWER = 50;
    final static String HERO_TYPE = "Soldier";

    public Soldier() {

        super(INITIAL_ATTACK_POWER, INITIAL_DEFENSE_POWER, HERO_TYPE);

    }

}

