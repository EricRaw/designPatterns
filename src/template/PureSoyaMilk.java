package template;

/**
 * @author EricRaww
 * @create 2020-12-15
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    boolean customerWantCondiments() {
        return false;
    }

    @Override
    void add() {

    }
}
