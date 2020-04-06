package decorator;

/**
 * author yg
 * description 奶油
 * date 2020/4/6
 */
public class Whip extends CondimentDecorator{
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }

    @Override
    public double cost() {
        return 0.88 + beverage.cost();
    }
}
