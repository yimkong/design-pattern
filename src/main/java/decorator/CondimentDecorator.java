package decorator;

/**
 * author yg
 * description 调料 抽象装饰者
 * date 2020/4/6
 */
public abstract class CondimentDecorator extends Beverage{
    @Override
    public abstract String getDescription();
}
