package bridge;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class FolderPhone extends Phone {
    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("folder phone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("folder phone");

    }

    @Override
    protected void call() {
        super.call();
        System.out.println("folder phone");

    }
}
