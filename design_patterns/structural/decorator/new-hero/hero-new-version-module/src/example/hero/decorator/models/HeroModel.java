package example.hero.decorator.models;

import example.hero.decorator.interfaces.Hero;

/**
 * HeroModel class provides detailed description of Hero object
 */
public class HeroModel implements Hero {

    int attackPower;
    int defensePower;
    String heroType;

    public HeroModel(int attackPower, int defensePower, String heroType) {

        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.heroType = heroType;

    }

    @Override
    public void attack(int algorithmDifficultyLevel) {
        System.out.println(this.heroType + " attack! Attack power: "
                + this.attackPower * algorithmDifficultyLevel);
    }

    @Override
    public void defend(int algorithmDifficultyLevel) {

        System.out.println(this.heroType + " defend! Defense power: "
                + this.defensePower * algorithmDifficultyLevel);

    }

    public int getAttackPower() {

        return attackPower;

    }

    public void setAttackPower(int attackPower) {

        this.attackPower = attackPower;

    }

    public int getDefensePower() {

        return defensePower;

    }

    public void setDefensePower(int defensePower) {

        this.defensePower = defensePower;

    }

    public String getHeroType() {

        return heroType;

    }

}
