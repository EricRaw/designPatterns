package memento.theory;

/**
 * @author EricRaww
 * @create 2021-03-17
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("state 1");
        caretaker.add(originator.saveStateMemento());
        originator.setState("state 2");
        caretaker.add(originator.saveStateMemento());
        originator.setState("state 3");
        caretaker.add(originator.saveStateMemento());
        originator.setState("state 4");
        caretaker.add(originator.saveStateMemento());
        Memento memento = caretaker.get(1);
        System.out.println(memento.getState());


    }
}
