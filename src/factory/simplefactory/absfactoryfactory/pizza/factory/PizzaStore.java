package factory.simplefactory.absfactoryfactory.pizza.factory;

/**
 * @author EricRaww
 * @create 2020-11-03
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new UKFactory());
    }
}
