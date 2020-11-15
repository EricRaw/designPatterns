package builder.improve;

/**
 * @author EricRaww
 * @create 2020-11-09
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("HighHouse buildBasic");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighHouse buildWalls");

    }

    @Override
    public void roofed() {
        System.out.println("HighHouse roofed");

    }
}
