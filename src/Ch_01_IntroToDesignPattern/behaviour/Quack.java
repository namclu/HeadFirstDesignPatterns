package Ch_01_IntroToDesignPattern.behaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I'm quacking");
    }
}
