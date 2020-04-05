package strategy;

/**
 * author yg
 * description
 * date 2020/4/5
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("can't fly");
    }
}
