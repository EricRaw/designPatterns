package factory.simplefactory;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" I am preparing Pepper");
    }
}
