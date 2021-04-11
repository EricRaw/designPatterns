package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior=new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("this is Peking Duck");
    }
}
