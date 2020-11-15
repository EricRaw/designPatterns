package bridge;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("UpRight Phone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("UpRight Phone");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("UpRight Phone");
    }
}
