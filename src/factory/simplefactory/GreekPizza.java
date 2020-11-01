package factory.simplefactory;

/**
 * @author EricRaww
 * @create 2020-11-01
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" I am preparing Greek");
    }
}
