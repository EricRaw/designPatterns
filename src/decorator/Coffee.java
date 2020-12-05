package decorator;

/**
 * @author EricRaww
 * @create 2020-12-05
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
