package proxy.staticproxy;

/**
 * @author EricRaww
 * @create 2020-11-29
 */
public class ProxyClient {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();

    }
}
