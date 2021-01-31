package myiterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author EricRaww
 * @create 2021-01-31
 */
public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println(next.getName());
            printDepartment(next.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
}
