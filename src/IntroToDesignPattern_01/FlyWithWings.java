package IntroToDesignPattern_01;

import IntroToDesignPattern_01.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying w wings");
    }
}
