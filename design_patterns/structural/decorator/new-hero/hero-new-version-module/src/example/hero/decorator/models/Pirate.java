package example.hero.decorator.models;

/**
 * Pirate class provides initial data for modeling Pirate object
 */
final public class Pirate extends HeroModel {

    final static int INITIAL_ATTACK_POWER = 30;
    final static int INITIAL_DEFENSE_POWER = 30;
    final static String HERO_TYPE = "Pirate";

    public Pirate() {

        super(INITIAL_ATTACK_POWER, INITIAL_DEFENSE_POWER, HERO_TYPE);

    }

}
