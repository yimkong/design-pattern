package strategy;

/**
 * author yg
 * description
 * 策略模式  把对象的行为抽象成接口，以便实现热插拔
 * wikipedia:
 * Define a family of algorithms,encapsulate each one,and make them interchangeable.Strategy lets the algorithm vary
 * independently from client that use it.
 * date 2020/4/5
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
