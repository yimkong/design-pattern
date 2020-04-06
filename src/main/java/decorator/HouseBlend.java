package decorator;

/**
 * author yg
 * description 家常咖啡
 * date 2020/4/6
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
