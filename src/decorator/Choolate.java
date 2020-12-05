package decorator;

/**
 * @author EricRaww
 * @create 2020-12-05
 */
public class Choolate extends Decorator {
    public Choolate(Drink obj) {
        super(obj);
        setDescription("Choolate");
        setPrice(2.0f);
    }
}
