package responsibichain;

import java.math.BigDecimal;

/**
 * @author EricRaww
 * @create 2021-04-12
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        int i = purchaseRequest.getPrice().compareTo(new BigDecimal("30000.00"));
        if(i == 1 ){
            System.out.println("id = "+purchaseRequest.getId()+" was processed by "+this.name);
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
