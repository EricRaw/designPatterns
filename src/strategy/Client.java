package strategy;

/**
 * @author EricRaww
 * @create 2021-04-11
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        System.out.println("------");
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
        System.out.println("-----");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();

    }
}
