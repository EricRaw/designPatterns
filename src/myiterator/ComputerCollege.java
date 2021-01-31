package myiterator;

import java.util.Iterator;

/**
 * @author EricRaww
 * @create 2021-01-31
 */
public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;
    public ComputerCollege(){
        departments=new Department[5];
        addDepartment("java","java desc");
        addDepartment("大数据","大数据 desc");
        addDepartment("算法","算法 desc");
        addDepartment("人工智能化","人工智能化 desc");
    }

    @Override
    public String getName() {
        return "Computer College";
    }

    @Override
    public void addDepartment(String name, String decs) {
        Department department=new Department(name,decs);
        departments[numOfDepartment]=department;
        numOfDepartment +=1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
