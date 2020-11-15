package bridge;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("ViVO is opening...");

    }

    @Override
    public void close() {
        System.out.println("ViVO is closed...");

    }

    @Override
    public void call() {
        System.out.println("ViVO is calling...");
    }
}
