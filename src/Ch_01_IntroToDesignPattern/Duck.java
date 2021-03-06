package Ch_01_IntroToDesignPattern;

import Ch_01_IntroToDesignPattern.behaviour.FlyBehaviour;
import Ch_01_IntroToDesignPattern.behaviour.QuackBehaviour;

public abstract class Duck {

    // reference variables
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    // Duck constructor
    public Duck() {
    }

    public abstract void display();

    // delegate fly and quack to the behavior class
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    // Setters and getters
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
}
