package IntroToDesignPattern_01.behaviour;

import IntroToDesignPattern_01.behaviour.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm squeaking, not quacking");
    }
}
