package strategy;

/**
 * author yg
 * description
 * date 2020/4/5
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<silence>>");
    }
}
