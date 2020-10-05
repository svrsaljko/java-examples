package example.hero.decorator.model;

public class Knight extends HeroModel {

    final static int INITIAL_ATTACK_POWER = 110;
    final static int INITIAL_DEFENSE_POWER = 110;
    final static String HERO_TYPE = "Knight";

    public Knight() {
        super(INITIAL_ATTACK_POWER, INITIAL_DEFENSE_POWER, HERO_TYPE);

    }
}
