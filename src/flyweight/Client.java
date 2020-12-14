package flyweight;

/**
 * @author EricRaww
 * @create 2020-12-14
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite chrome = factory.getWebSiteCategory("chrome");
        chrome.use(new User("eric"));
        WebSite xiaochengxu = factory.getWebSiteCategory("小程序");
        xiaochengxu.use(new User("HY"));
        System.out.println(factory.getSumofWebSite());
        WebSite program = factory.getWebSiteCategory("公司程序");
        program.use(new User("HY1"));

    }
}
