package myiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author EricRaww
 * @create 2021-01-31
 */
public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege() {
        departmentList=new ArrayList<Department>();
        addDepartment("信息安全","信息");
        addDepartment("网路安全","网路");
        addDepartment("服务器安全","服务器");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String decs) {
        Department department= new Department(name,decs);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
