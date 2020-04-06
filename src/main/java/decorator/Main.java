package decorator;

/**
 * author yg
 * description 装饰者模式：动态地将责任附加到对象上，若要拓展功能，装饰者提供了比继承更有弹性的替代方案
 * date 2020/4/6
 */
public class Main {
    public static void main(String[] args) {
        //双倍摩卡奶油咖啡
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " cost:" + beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " cost:" + beverage.cost());
    }
}
