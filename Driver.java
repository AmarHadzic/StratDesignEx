public class Driver
{

    public static void main(String[] args)
    {
        Duck mallord = new Mallord();
        mallord.setFlyBehavior(new NoFly());
        mallord.setQuackBehavior(new Mute());

        Duck flyingDuck = new FlyingDuck();
        flyingDuck.setFlyBehavior(new Fly());
        flyingDuck.setQuackBehavior(new Quack());

        mallord.performFly();
        mallord.performQuack();

        flyingDuck.performFly();
        flyingDuck.performQuack();

    }


}