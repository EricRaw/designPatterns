package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior=new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("this is Toy Duck");
    }
}
