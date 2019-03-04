package Ch_01_IntroToDesignPattern.behaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm squeaking, not quacking");
    }
}
