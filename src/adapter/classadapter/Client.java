package adapter.classadapter;

/**
 * @author EricRaww
 * @create 2020-11-15
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
