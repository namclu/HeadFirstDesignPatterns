package Ch_01_IntroToDesignPattern;

import Ch_01_IntroToDesignPattern.behaviour.FlyNoWay;
import Ch_01_IntroToDesignPattern.behaviour.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
