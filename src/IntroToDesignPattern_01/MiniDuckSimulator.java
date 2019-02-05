package IntroToDesignPattern_01;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        // calls MallardDucks's inherited performFly() method, which delegates to objects FlyBehavior
        mallard.performFly();

        // calls MallardDucks's inherited performQuack() method, which delegates to objects QuackBehavior
        mallard.performQuack();

        mallard.quackBehaviour.quack();
        mallard.flyBehaviour.fly();
    }
}
