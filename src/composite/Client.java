package composite;

import java.util.HashMap;

/**
 * @author EricRaww
 * @create 2020-12-12
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("北极大学", "the coldest");
        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("化工与制药学院", "化工与制药学院");
        OrganizationComponent department11 = new Department("软件工程", "写代码");
        OrganizationComponent department12 = new Department("网络工程专业", "拉网线");
        OrganizationComponent department21 = new Department("化工", "挖煤");
        OrganizationComponent department22 = new Department("制药", "做丸子");
        college1.add(department11);
        college1.add(department12);
        college2.add(department21);
        college2.add(department22);
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
