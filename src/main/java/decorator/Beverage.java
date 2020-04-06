package decorator;

/**
 * author yg
 * description 饮料
 * date 2020/4/6
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
