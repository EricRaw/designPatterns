package responsibichain;

import java.math.BigDecimal;

/**
 * @author EricRaww
 * @create 2021-04-12
 */
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        int i = purchaseRequest.getPrice().compareTo(new BigDecimal("10000.00"));
        int i1 = purchaseRequest.getPrice().compareTo(new BigDecimal("15000.00"));
        if(i == 1 && i1==-1){
            System.out.println("id = "+purchaseRequest.getId()+" was processed by "+this.name);
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
