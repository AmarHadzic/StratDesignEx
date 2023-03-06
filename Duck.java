public class Duck
{
    protected FlyBehavior fb;
    protected QuackBehavior qb;

    public void swim()
    {
        System.out.println("Swimming...");
    }

    public void display()
    {
        System.out.println("I am a duck");
    }

    public void performFly()
    {
        this.fb.fly();
    }

    public void performQuack()
    {
        this.qb.quack();
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        this.fb = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        this.qb = qb;
    }



}