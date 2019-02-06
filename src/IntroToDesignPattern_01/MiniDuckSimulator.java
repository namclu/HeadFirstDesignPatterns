package IntroToDesignPattern_01;

import IntroToDesignPattern_01.behaviour.FlyRocketPowered;
import IntroToDesignPattern_01.behaviour.Squeak;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // calls MallardDucks's inherited performFly() method, which delegates to object's FlyBehavior
        mallard.performFly();
        // calls MallardDucks's inherited performQuack() method, which delegates to object's QuackBehavior
        mallard.performQuack();

        Duck model = new ModelDuck();
        // called ModelDuck's inherited performFly() method, which delegates to object's FlyBehavior
        // use setter to set a new fly behaviour at runtime
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        // calls ModelDucks's inherited performQuack() method, which delegates to object's QuackBehavior
        // use setter to set a new quack behaviour at runtime
        model.performQuack();
        model.setQuackBehaviour(new Squeak());
        model.performQuack();
    }
}
