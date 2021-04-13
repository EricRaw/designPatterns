package responsibichain;

/**
 * @author EricRaww
 * @create 2021-04-12
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
