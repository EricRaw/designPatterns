package memento.theory;

/**
 * @author EricRaww
 * @create 2021-03-17
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 可以
     * @return
     */
    public Memento saveStateMemento(){
        return new Memento(state) ;
    }
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
