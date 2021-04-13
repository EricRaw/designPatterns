package responsibichain;

import java.math.BigDecimal;

/**
 * @author EricRaww
 * @create 2021-04-12
 */
public class PurchaseRequest {
    private int type=0;
    private BigDecimal price=new BigDecimal("0.00");
    private int id=0;

    public PurchaseRequest(int type,BigDecimal price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
