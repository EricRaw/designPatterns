package factory.simplefactory.factorymethod;

/**
 * @author EricRaww
 * @create 2020-11-02
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing Beijing Pepper");
    }
}
