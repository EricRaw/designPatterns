package bridge;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class Apple implements Brand {
    @Override
    public void open() {
        System.out.println("APPLE is opening...");

    }

    @Override
    public void close() {
        System.out.println("APPLE is closed...");

    }

    @Override
    public void call() {
        System.out.println("APPLE is calling...");
    }
}
