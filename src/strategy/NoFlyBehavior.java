package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("this is No FlyBehavior");
    }
}
