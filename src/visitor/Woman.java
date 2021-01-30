package visitor;

/**
 * @author EricRaww
 * @create 2021-01-30
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {

        action.getWomanResult(this);
    }
}
