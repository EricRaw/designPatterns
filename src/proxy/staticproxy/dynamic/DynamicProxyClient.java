package proxy.staticproxy.dynamic;

/**
 * @author EricRaww
 * @create 2020-11-29
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();
    }
}
