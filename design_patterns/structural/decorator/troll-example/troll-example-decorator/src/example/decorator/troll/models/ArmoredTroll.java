package example.decorator.troll.models;

import example.decorator.troll.interfaces.Troll;

public class ArmoredTroll  implements Troll {

    private final Troll decorated;

    public ArmoredTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("Armored troll attacks");
    }

    @Override
    public int getAttackPower() {
       return decorated.getAttackPower() + 1000;

    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
        System.out.println("I am armored troll :)");
    }
}
