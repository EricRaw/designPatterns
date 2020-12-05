package decorator;

/**
 * @author EricRaww
 * @create 2020-12-05
 */
public abstract class Drink {
    public String description;
    private float price=0.0f;

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
