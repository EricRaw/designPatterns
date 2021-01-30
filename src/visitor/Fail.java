package visitor;

/**
 * @author EricRaww
 * @create 2021-01-30
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("man with fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman with fail");

    }
}
