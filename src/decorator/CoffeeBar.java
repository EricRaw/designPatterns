package decorator;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @author EricRaww
 * @create 2020-12-05
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.cost());
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.cost());
        longBlack = new Milk(longBlack);
        System.out.println(longBlack.cost());
        longBlack=new Choolate(longBlack);
        System.out.println(longBlack.cost());
    }
}
