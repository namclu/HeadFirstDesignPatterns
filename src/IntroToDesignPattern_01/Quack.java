package IntroToDesignPattern_01;

import IntroToDesignPattern_01.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
