package example.hero.decorator.model;


import example.hero.decorator.interfaces.Hero;

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
    public void attack() {
        System.out.println(this.heroType + " attack! Attack power: " +
                this.attackPower);
    }

    @Override
    public void defend() {
        System.out.println(this.heroType + " defend! Defense power: " +
                this.defensePower);
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

    // zanimljivo za implementaciju upgrade-a
    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

}
