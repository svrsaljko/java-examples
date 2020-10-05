package example.hero.decorator.model;

final public class Soldier extends HeroModel {

    final static int INITIAL_ATTACK_POWER = 50;
    final static int INITIAL_DEFENSE_POWER = 50;
    final static String HERO_TYPE = "Soldier";

    public Soldier() {
        super(INITIAL_ATTACK_POWER, INITIAL_DEFENSE_POWER, HERO_TYPE);
    }
}
