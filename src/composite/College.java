package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EricRaww
 * @create 2020-12-12
 */
public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentList=new ArrayList<>();
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }


    @Override
    protected void print() {
        System.out.println("-----------"+super.getName()+"-------");
        for (OrganizationComponent o:organizationComponentList){
            o.print();
        }

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
