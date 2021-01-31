package myiterator;

import java.util.Iterator;

/**
 * @author EricRaww
 * @create 2021-01-31
 */
public interface College {
    String getName();

    void addDepartment(String name,String decs);

    Iterator createIterator();

}
