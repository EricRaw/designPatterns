package proxy.staticproxy.dynamic;

/**
 * @author EricRaww
 * @create 2020-11-29
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao is teaching");
    }
}
