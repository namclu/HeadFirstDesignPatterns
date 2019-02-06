package IntroToDesignPattern_01;

import IntroToDesignPattern_01.behaviour.FlyNoWay;
import IntroToDesignPattern_01.behaviour.Quack;

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
