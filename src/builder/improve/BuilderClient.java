package builder.improve;

/**
 * @author EricRaww
 * @create 2020-11-09
 */
public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.construct();
        HouseBuilder highHouse=new HighHouse();
        houseDirector = new HouseDirector(highHouse);
        houseDirector.construct();
        StringBuilder s=null;
        StringBuffer s1=null;
    }
}
