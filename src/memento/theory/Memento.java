package memento.theory;

/**
 * @author EricRaww
 * @create 2021-03-17
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
