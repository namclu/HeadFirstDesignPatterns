package Ch_01_IntroToDesignPattern.behaviour;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying w a rocket!");
    }
}
