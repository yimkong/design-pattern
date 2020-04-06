package decorator;

/**
 * author yg
 * description 浓缩咖啡
 * date 2020/4/6
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
