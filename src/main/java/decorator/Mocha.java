package decorator;

/**
 * author yg
 * description 摩卡
 * date 2020/4/6
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
