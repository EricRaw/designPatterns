package decorator;

/**
 * @author EricRaww
 * @create 2020-12-05
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDescription("Milk");
        setPrice(0.5f);
    }
}
