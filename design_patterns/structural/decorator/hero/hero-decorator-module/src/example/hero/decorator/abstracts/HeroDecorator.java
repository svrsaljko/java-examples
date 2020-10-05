package example.hero.decorator.abstracts;

import example.hero.decorator.interfaces.Hero;
import example.hero.decorator.model.HeroModel;

public abstract class HeroDecorator implements Hero {

    protected HeroModel decoratedHero;

    public HeroDecorator(HeroModel decoratedHero){
        this.decoratedHero=  decoratedHero;;

    }

  public abstract void attack( );
   public abstract void defend( );

}
