package visitor;

/**
 * @author EricRaww
 * @create 2021-01-30
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);

    }
}
