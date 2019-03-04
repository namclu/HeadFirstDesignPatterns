package Ch_01_IntroToDesignPattern;

import Ch_01_IntroToDesignPattern.behaviour.FlyWithWings;
import Ch_01_IntroToDesignPattern.behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // variables inherited from Duck class

        // responsibility for flying is delegated to the concrete FlyWithWings object
        // for flyBehavior, we could also call its concrete class new FlyNoWay()
        flyBehaviour = new FlyWithWings();

        // responsibility for quacking is delegated to the concrete Quack object
        // for quackBehavior, we could also call its concrete classes new Squeak(), or new MuteQuack()
        quackBehaviour = new Quack();
    }

    // required abstract display() method
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
