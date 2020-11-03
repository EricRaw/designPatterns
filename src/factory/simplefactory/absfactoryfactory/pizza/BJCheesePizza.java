package factory.simplefactory.absfactoryfactory.pizza;

/**
 * @author EricRaww
 * @create 2020-11-02
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing Beijing Cheese");
    }
}
