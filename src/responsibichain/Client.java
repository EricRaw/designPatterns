package responsibichain;

import java.math.BigDecimal;

/**
 * @author EricRaww
 * @create 2021-04-13
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, new BigDecimal(1000.01), 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("罗主任");
        CollegeApprover collegeApprover = new CollegeApprover("罗院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("罗副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("罗校长");

        //设置审批链
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
//        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
