package memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EricRaww
 * @create 2021-03-17
 */
public class Caretaker {
    private List<Memento> mementoList=new ArrayList<>(16);
    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(Integer index){
        return mementoList.get(index);
    }

}
