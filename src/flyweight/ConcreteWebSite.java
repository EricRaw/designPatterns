package flyweight;

/**
 * @author EricRaww
 * @create 2020-12-14
 */
public class ConcreteWebSite extends WebSite{
    private String type="";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为： "+type+" 使用者是："+user.getName());

    }
}
