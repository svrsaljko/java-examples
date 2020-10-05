package example.hero.decorator.model;

public class Teuton extends HeroModel {

    final static int INITIAL_ATTACK_POWER = 100;
    final static int INITIAL_DEFENSE_POWER = 100;
    final static String HERO_TYPE = "Teuton";

    public Teuton() {
        super(INITIAL_ATTACK_POWER, INITIAL_DEFENSE_POWER, HERO_TYPE);
    }
}
