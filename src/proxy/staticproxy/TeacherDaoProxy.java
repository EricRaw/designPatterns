package proxy.staticproxy;

/**
 * @author EricRaww
 * @create 2020-11-29
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;
    public TeacherDaoProxy(ITeacherDao target) {
        super();
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
