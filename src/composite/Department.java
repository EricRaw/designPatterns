package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EricRaww
 * @create 2020-12-12
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    protected void print() {
        System.out.println(getName()+"-------"+getDes());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }
}
