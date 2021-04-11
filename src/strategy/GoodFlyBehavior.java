package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" this is Good FlyBehavior");
    }
}
