package strategy;

/**
 * author yg
 * description 绿头鸭
 * date 2020/4/5
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display() {
        System.out.println("i am MallardDuck");
    }
}
