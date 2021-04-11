package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior=new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("this is WildDuck");
    }
}
