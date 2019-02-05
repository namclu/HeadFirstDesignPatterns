package IntroToDesignPattern_01.behaviour;

import IntroToDesignPattern_01.behaviour.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
