package visitor;

import java.io.ObjectInputStream;

/**
 * @author EricRaww
 * @create 2021-01-30
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        Success success = new Success();
        objectStructure.display(success);
        Fail fail = new Fail();
        objectStructure.display(fail);

    }
}
