package myiterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author EricRaww
 * @create 2021-01-31
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index=-1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size()-1){
            return false;
        }else {
            index +=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
